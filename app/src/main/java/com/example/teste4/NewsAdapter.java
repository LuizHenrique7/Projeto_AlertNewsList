package com.example.teste4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    private Context context;

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final News currentNews = getItem(position);
        TextView textNewsTextView = convertView.findViewById(R.id.textNews);
        textNewsTextView.setText(currentNews.getText());

        Button buttonVerMais = convertView.findViewById(R.id.buttonVerMais);
        buttonVerMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFullNews(currentNews.getFullText());
            }
        });

        return convertView;
    }

    private void openFullNews(String fullNewsText) {
        Intent intent = new Intent(context, Activity2.class);
        intent.putExtra("noticia_completa", fullNewsText);
        context.startActivity(intent);
    }
}
