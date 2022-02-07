fun main(){
    val endereco =Endereco()
    endereco.bairo ="Sarandi"
    endereco.cidade ="Porto Alegre"
    endereco.estado ="RS"

    val charly = Vendedor()
    charly.nome = "Charly"
    charly.telefone = "78453534"
    charly.cpf = "65454574576"
    charly.email = "charly11@gmail.com"
   charly.endereco = endereco

    val felipe = Cliente()
    felipe.nome = "Felipe"
    felipe.cpf = "46457876685"
    felipe.telefone = "87055245"
    felipe.email = "felipe23@gmail.com"

    val luiz = Cliente()
    luiz.nome = "luiz"
    luiz.cpf = "60862867742"
    luiz.telefone = "89347509"
    luiz.email = "luizsouza@gmail.com"

    val webley = Fornecedor()
    webley.nome = "Webley"
    webley.telefone = "45346767"
    webley.cnpj = "985.606.096.36505"

    val desenho = Produto()
    desenho.nome = "Desenho"
    desenho.descricao ="Desenho do morgan freeman, tamanho A1"
    desenho.preco = 2000

    val guem = Transportadora()
    guem.nome = "Guem"
    guem.telefone = "94964409"
    guem.cnpj = "70779070985459"

    val venda = Venda()
    venda.valor = 6000
    venda.quantidade= 3
    venda.date = "11/02/2021"

 println(felipe)
    println(charly)
    println(luiz)
    println(webley)
    println(desenho)
    println()
    println("Nome do vendedor ${charly.nome}" )

}