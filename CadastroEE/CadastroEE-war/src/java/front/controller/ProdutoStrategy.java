/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.controller;


import cadastroee.controller.ProdutoFacadeLocal;
import cadastroee.model.Produto;
import front.controller.Strategy;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


public class ProdutoStrategy extends Strategy<ProdutoFacadeLocal> {

    public ProdutoStrategy(ProdutoFacadeLocal facade) {
        super(facade);
    }

    @Override
    public String executar(String acao, HttpServletRequest request) {
        String paginaDestino = "ListaProduto.jsp";

        switch (acao) {
            case "listaProd":
                listarProdutos(request);
                break;
            case "excProdExec":
                removerProduto(request);
                listarProdutos(request);
                break;
            case "editProd":
                exibirPaginaEditar(request);
                paginaDestino = "EditarProduto.jsp";
                break;
            case "editProdExec":
                editarProduto(request);
                listarProdutos(request);
                break;
            case "incProdExec":
                incluirProduto(request);
                listarProdutos(request);
                break;
            case "incProd":
                paginaDestino = "DadosProduto.jsp";
                request.setAttribute("produto", new Produto());
                break;
        }

        return paginaDestino;
    }

    private void listarProdutos(HttpServletRequest request) {
        List<Produto> produtos = facade.findAll();
        request.setAttribute("lista", produtos);
    }

    private void removerProduto(HttpServletRequest request) {
        int codigo = Integer.parseInt(request.getParameter("cod"));
        Produto produto = facade.find(codigo);
        if (produto != null) {
            facade.remove(produto);
        }
    }

    private void exibirPaginaEditar(HttpServletRequest request) {
        int codigo = Integer.parseInt(request.getParameter("codProduto"));
        Produto produtoEdit = facade.find(codigo);
        if (produtoEdit != null) {
            request.setAttribute("produtoEdit", produtoEdit);
        }
    }

    private void editarProduto(HttpServletRequest request) {
        int codProdutoEdit = Integer.parseInt(request.getParameter("codProduto")); 

        Produto produtoEdit = facade.find(codProdutoEdit);
        if (produtoEdit != null) {
            String nome = request.getParameter("nome");
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
            produtoEdit.setNome(nome);
            produtoEdit.setQuantidade(quantidade);
            produtoEdit.setPrecoVenda(precoVenda);
            facade.edit(produtoEdit);
        }
    }

    private void incluirProduto(HttpServletRequest request) {
        String nome = request.getParameter("nome");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        float precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
        List<Produto> produtos = facade.findAll();
        int novoCodProduto = 1;
        if (!produtos.isEmpty()) {
            int maxCodProduto = produtos.stream()
                    .mapToInt(Produto::getCodProduto)
                    .max()
                    .getAsInt();
            novoCodProduto = maxCodProduto + 1;
        }

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setCodProduto(novoCodProduto);
        produto.setPrecoVenda(precoVenda);
        facade.create(produto);
    }
}
    

