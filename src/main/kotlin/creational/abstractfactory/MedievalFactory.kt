package creational.abstractfactory

class MedievalFactory: AbstractFactory {
    override fun createCastle(): Castle {
        return MedievalCastle()
    }

    override fun createWall(): Wall {
        return MedievalWall()
    }

    override fun createTower(): Tower {
        return MedievalTower()
    }
}