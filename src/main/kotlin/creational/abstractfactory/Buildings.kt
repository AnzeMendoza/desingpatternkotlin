package creational.abstractfactory

class MedievalCastle: Castle {
    override fun getDescription(): String {
        return "Medieval Castle"
    }
}

class MedievalWall: Wall {
    override fun getMaterial(): String {
        return "Stone"
    }
}

class MedievalTower: Tower {
    override fun getHeight(): Int {
        return 30
    }
}

class FuturisticCastle: Castle {
    override fun getDescription(): String {
        return "Futuristic Castle"
    }
}

class FuturisticWall: Wall {
    override fun getMaterial(): String {
        return "Titanium"
    }
}

class FuturisticTower: Tower {
    override fun getHeight(): Int {
        return 100
    }

}