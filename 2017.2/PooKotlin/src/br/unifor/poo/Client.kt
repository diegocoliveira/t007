package br.unifor.poo

class Client(a: String, b: String, c: String, override val x: String): Foo, User(a,b,c) {
    
    override fun createUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}