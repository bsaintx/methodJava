# Métodos
Antes de criar um método, este, precisa ter uma finalidade.
Convenção:
    - camelCase
    - verbo (acelerar, falar)
    - recomendado ter uma função apenas.

# Critérios
Qual é a proposta principal do método?
Qual o tipo de retorno esperado após executar o método?

Caso o método não retorne nenhum valor é preciso usar a palavra-chave: void.

# Perguntas Imporantes
Quais os parâmetros serão necessários para execução do método?
O método possui o risco de apresnetar alguma exceção?
    -Tratar uma possível limitação caso seja necessário tratar um erro.
Qual a visibilidade do método?

# Estrutura
tipo nome (parâmetros)
    corpo(algorítmo)
    caso retorne algo, retornar com o tipo correspondente.

ex: 
public doble calcular (int num1, int num2) {
    - Lógica (algorítmo)
    - return...
}