class produto(val nome: String, val preco: Double, val quantidade: Int){
   fun calcularTotal (preco: Double, quantidade: Int):Double{
       return preco * quantidade
   }
}
