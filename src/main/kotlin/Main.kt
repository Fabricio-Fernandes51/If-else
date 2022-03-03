@file:Suppress("UNREACHABLE_CODE", "UnusedEquals")

fun main(args: Array<String>) {

}

fun triangulo() {
    println("Digite o primeiro lado do triângulo")
    val primeiroLado = readLine()!!.toInt()

    println("Digite o segundo lado do triângulo")
    val segundoLado = readLine()!!.toInt()

    println("Digite o terceiro lado do triângulo")
    val terceiroLado = readLine()!!.toInt()

    if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
        println("Triâgulo Equilátero")
    } else if (primeiroLado == segundoLado && segundoLado != terceiroLado ||
        primeiroLado != segundoLado && segundoLado == terceiroLado ||
        primeiroLado != terceiroLado && segundoLado == terceiroLado ||
        primeiroLado == terceiroLado && segundoLado != terceiroLado
    ) {
        println("Triângulo Isósceles")
    } else if (primeiroLado != segundoLado && segundoLado != terceiroLado) {
        println("Triângulo Escaleno")
    } else {
        println("se chegou a esse resultado algo deu muito errado")
    }

}

fun bissexto(){
    println("Digite um ano qualquer:")
    val ano = readLine()!!.toInt()

    if(ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
        println("O $ano é bissexto")
    } else{
        println("O $ano não é bissexto")
    }
}

fun detetive(): Any{
    println("Reponda usando\n0 - não\n1 - sim")

    println("Telefonou para a vítima?")
    val pergunta = readLine()!!.toInt()
    if (pergunta == 1) {
        return 1
    } else if (pergunta == 0) {
        return 0
    } else {
        println("reposta invalida")
    }

    println("Esteve no local do crime?")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1) {
        return 1
    } else if (pergunta == 0) {
        return 0
    } else {
        println("reposta invalida")
    }

    println("Mora perto da vítima?")
    val pergunta3 = readLine()!!.toInt()
    if (pergunta3 == 1) {
        return 1
    } else if (pergunta == 0) {
        return 0
    } else {
        println("reposta invalida")
    }

    println("Devia para a vítima?")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 == 1) {
        return 1
    } else if (pergunta == 0) {
        return 0
    } else {
        println("reposta invalida")
    }

    println("Já trabalhou com a vítima?")
    val pergunta5 = readLine()!!.toInt()
    return if (pergunta5 == 1) {
        return 1
    } else if (pergunta == 0) {
        return 0
    } else {
        println("reposta invalida")
    }

    val media = (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
    if(media <= 1){
        println("Você é inocente")
    } else if (media == 2){
        println("Você é suspeito")
    } else if (media <= 4){
        println("Você é cumplice")
    } else if (media == 5){
        println("Você é o assassino")
    } else {
        println("Respota inválida")
    }


}

fun combustivel() {
    println("Qual tipo de combustível você quer?\nG - Gasolina\nA - Álcool")
    val tipoDeCombustivel = readLine()!!.toString()

    println("Quantos litros você vai querer?")
    val litros = readLine()!!.toInt()

    val preco = (litros * 6)

    if (tipoDeCombustivel.equals("a", true) && litros <= 20){
        println("O valor total é: ${preco - (preco * 3) / 100}")
    } else if (tipoDeCombustivel.equals("a", true) && litros >= 20){
        println("O valor total é: ${preco - (preco * 5)/ 100}")
    } else if (tipoDeCombustivel.equals("g", true) && litros <= 20){
        println("O valor total é: ${preco - (preco * 4)/ 100}")
    } else if (tipoDeCombustivel.equals("g", true) && litros >= 20){
        println("O valor total é: ${preco - (preco * 6)/ 100}")
    } else{
        println("ops! algo deu errado")
    }
}