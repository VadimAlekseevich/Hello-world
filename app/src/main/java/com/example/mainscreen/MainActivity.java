package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import money.MoneyAdapter;
import money.MoneyCellModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    money.MoneyAdapter MoneyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.costsRecyclerViem);
        MoneyAdapter = new MoneyAdapter();

        recyclerView.setAdapter(MoneyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        MoneyAdapter.setData(generateExpenses());
    }

    private List<MoneyCellModel> generateExpenses() {
        List<MoneyCellModel> moneyCellModels = new ArrayList<>();
        moneyCellModels.add(new MoneyCellModel("Молоко", "70 ₽", R.color.expenseColor));
        moneyCellModels.add(new MoneyCellModel("Зубная щётка", "70 ₽", R.color.expenseColor));
        moneyCellModels.add(new MoneyCellModel("Сковородка с \n" +
                "антипригарным\n" +
                "покрытием", "1670 ₽", R.color.expenseColor));

        return moneyCellModels;
    }

    private List<MoneyCellModel> gemerateIncomes() {
        List<MoneyCellModel> moneyCellModels = new ArrayList<>();
        moneyCellModels.add(new MoneyCellModel("Зарплата.Июнь", "70000 ₽", R.color.incomeColor));
        moneyCellModels.add(new MoneyCellModel("Премия", "7000 ₽", R.color.incomeColor));
        moneyCellModels.add(new MoneyCellModel("Олег наконец-то вернул долг", "300000 ₽", R.color.incomeColor));

        return moneyCellModels;

    }
}

TODO // new list2

//TODO LIST3 changed