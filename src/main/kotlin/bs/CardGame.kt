package jp.co.main.bs

class CardGame {
    fun execute() {
        val n = readLine()!!.toInt()
        val cardList = readLine()!!.split(" ")
            .mapIndexed { index, s -> Card(index, s.toInt()) }
            .toMutableList()

        val deck = Deck(cardList)

        val alice = Player(mutableListOf<Card>())
        val bob = Player(mutableListOf<Card>())

        var nowPlayer = alice

        for(i in 1..n) {
            nowPlayer.nextHand(deck)
            if (nowPlayer == alice) nowPlayer = bob else nowPlayer = alice
        }
        print("${alice.sum() - bob.sum()}")

    }
}

data class Player(val cardList: MutableList<Card>) {

    fun nextHand(deck: Deck) {
        cardList.add(deck.next())
    }

    fun sum(): Int {
        return cardList.sumBy { it.num }
    }
}

data class Card(val index:Int, val num:Int)

data class Deck(var cardList: MutableList<Card>) {
    fun next(): Card {
        val maxVal = cardList.map { it.num }.max()
        val removeCard = cardList.find { it.num == maxVal }!!
        cardList.remove(removeCard)
        return removeCard
    }

    fun hasNext(): Boolean = cardList.isNotEmpty()
}