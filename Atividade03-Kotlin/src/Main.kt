import java.text.DecimalFormat

fun main() {


        val nomeProduto: String = "Notebook"
        val precoUnitario: Double = 3500.0
        val quantidadeComprada: Int = 10
        val taxaImposto: Double = 15.0
        val margemLucro: Double = 20.0



        val valorTotalSemImpostos = precoUnitario * quantidadeComprada
        val valorImposto = valorTotalSemImpostos * (taxaImposto / 100)
        val valorTotalComImpostos = valorTotalSemImpostos + valorImposto
        val precoVendaNecessario = valorTotalComImpostos * (1 + (margemLucro / 100))


        val df = DecimalFormat("R$ #,##0.00")
        val valorTotalComImpostosFormatado = df.format(valorTotalComImpostos)
        val precoVendaFormatado = df.format(precoVendaNecessario)

        val mensagemFinal = """
        Produto: $nomeProduto
        Valor Total com Impostos: $valorTotalComImpostosFormatado
        Preço de Venda Sugerido: $precoVendaFormatado
    """.trimIndent()


        println("Nome do Produto: $nomeProduto")
        println("Preço Unitário: R$ ${df.format(precoUnitario)}")
        println("Quantidade Comprada: $quantidadeComprada")
        println("Taxa de Imposto: $taxaImposto%")
        println("Margem de Lucro: $margemLucro%")
        println("Valor Total Sem Impostos: ${df.format(valorTotalSemImpostos)}")
        println("Valor do Imposto: ${df.format(valorImposto)}")
        println("Valor Total Com Impostos: $valorTotalComImpostosFormatado")
        println("Preço de Venda Necessário: $precoVendaFormatado")
        println(mensagemFinal)


}