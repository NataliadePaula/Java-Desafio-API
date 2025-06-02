public record Itens(String cep, String logradouro, String bairro, String localidade, String uf) {

    @Override
    public String toString() {
        return "(CEP: "+cep +", logradouro: "+logradouro + ", bairro: " + bairro + ", localidade: " + localidade + " e uf: " + uf +")";
    }
}
