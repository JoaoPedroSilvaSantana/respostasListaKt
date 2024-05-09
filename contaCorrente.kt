class ContaCorrente(val numeroConta: Int, val saldo: Double){
    fun depositar(valor: Double){
        saldo += valor
    }
    
    fun sacar(valor: Double){
        if(valor <= saldo){
            saldo -= valor
        } else {
            fun apresentar(){
            println("Saldo insuficiente")
            }
        }
    }
    fun apresentar(){
        println("Seu numero da conta é $numeroConta, Seu saldo da conta é $saldo")
        }
    
}
