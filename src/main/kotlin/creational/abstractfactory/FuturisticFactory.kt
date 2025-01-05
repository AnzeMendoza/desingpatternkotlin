package creational.abstractfactory

class FuturisticFactory: AbstractFactory {
    override fun createCastle(): Castle {
        return FuturisticCastle()
    }

    override fun createWall(): Wall {
        return FuturisticWall()
    }

    override fun createTower(): Tower {
        return FuturisticTower()
    }
}