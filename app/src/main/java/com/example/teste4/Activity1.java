package com.example.teste4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<News> newsList = new ArrayList<>();
        newsList.add(new News("Governo da França recebe atualização do software da Apple após suspensão da venda do iPhone 12", "Governo da França recebe atualização do software da Apple após suspensão da venda do iPhone 12 \n\nAutoridades francesas receberam nesta terça-feira (26) uma atualização de software da Apple para seu iPhone 12, lançado em 2020. O novo sistema ainda será avaliado em relação ao problema de radiação, segundo a agência de notícias Reuters. Segundo o governo da França, o produto excede os limites de valores de ondas eletromagnéticas emitidas e que depois serão absorvidas pelo corpo humano, de acordo com a Agência Nacional de Frequências (ANFR).\n\nA Apple disse à Reuters que iria atualizar o software depois que o governo francês suspendeu as vendas dos telefones no início de setembro após testes mostrarem violações dos limites de exposição à radiação. O governo pediu que a Apple 'utilize todos os meios disponíveis para remediar rapidamente essa falha' nos exemplares que já foram vendidos. O ministro francês responsável pelo setor digital, Jean-Noël Barrot, disse que, para cumprir as regulamentações, uma simples atualização de software do iPhone 12 seria suficiente. Especificamente, o iPhone 12 excede em 1,74 W por quilograma (W/kg) o valor limite regulamentar correspondente à energia que o corpo humano pode absorver quando o telefone é segurado na mão. 'Confio no senso de responsabilidade da empresa para cumprir nossas regras. Minha missão é fazer com que sejam respeitadas. Se não o fizerem, estou pronto para ordenar a retirada do iPhone 12 de circulação', disse Jean-Noël Barrot."));
        newsList.add(new News("Pré-venda do iPhone 15 no Brasil começa na próxima quarta; confira os preços", "Pré-venda do iPhone 15 no Brasil começa na próxima quarta; confira os preços  Interessados poderão adquirir a nova linha, iPhone 15, 15 Plus, 15 Pro e 15 Pro Max, a partir de 27 de setembro.\n\nA Apple atualizou seu site para informar que a pré-venda do iPhone 15 no Brasil começa na próxima quarta-feira (27). A empresa, no entanto, não informa a data para entrega.  A disponibilidade para os interessados no Brasil começa cerca de três semanas após o lançamento oficial dos aparelhos. No evento, que aconteceu nos EUA, a Apple apresentou quatro modelos: iPhone 15, iPhone 15 Plus, iPhone 15 Pro e iPhone 15 Pro Max.  A empresa aceita pagamentos em até 12 parcelas sem juros e oferece 10% de desconto no pagamento à vista."));
        newsList.add(new News("O que é USB-C, padrão de conexão que o iPhone passa a adotar, depois de pressão sobre a Apple", "O que é USB-C, padrão de conexão que o iPhone passa a adotar, depois de pressão sobre a Apple\n\nConector universal já é encontrado em celulares Android e notebooks, entre outros aparelhos, e substituirá o Lightning. União Europeia determinou que empresas usem padrão único.\n\nO iPhone fica um pouco menos exclusivo a partir de agora: a linha 15 passa a adotar um padrão mais 'popular' de conexão com o carregador e outros dispositivos. Sai o modelo Lightning, que era usado há dez anos pela Apple, e entra o USB-C (também conhecido como USB tipo C), presente em celulares como os da Samsung e diversas outras marcas.\n\nA novidade é forçada por uma determinação da União Europeia por padronização dos carregadores. A tecnologia USB tipo C surgiu em 2014, criada pelo USB Implementers Forum (USB-IF), grupo que reúne fabricantes de softwares líderes do mercado. Juntas, essas empresas desenvolvem os padrões a serem adotados nas especificações técnicas do Universal Serial Bus (USB).\n\nNos anos seguintes, o USB-C conquistaria o mercado pela praticidade, tamanho e velocidade de transmissão de dados. A própria Apple já tinha adotado o padrão para Macbook, iPad e os fones de ouvido Airpod. Além dele, existe o USB-A, que é a conexão mais comum."));


        NewsAdapter adapter = new NewsAdapter(this, newsList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                News selectedNews = newsList.get(position);
                Toast.makeText(Activity1.this, "Selected: " + selectedNews.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
