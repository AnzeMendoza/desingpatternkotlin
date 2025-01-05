package creational.abstractfactory

interface AbstractFactory {
    fun createCastle(): Castle
    fun createWall(): Wall
    fun createTower(): Tower
}