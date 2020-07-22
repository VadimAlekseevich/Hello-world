package money;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mainscreen.R;

import java.util.ArrayList;
import java.util.List;

public class MoneyAdapter extends RecyclerView.Adapter<MoneyAdapter.MoneyViemHolder> {

    List<MoneyCellModel> moneyCellModels = new ArrayList<>();

    public void setData(List<MoneyCellModel> moneyCellModels) {
        this.moneyCellModels.clear();
        this.moneyCellModels.addAll(moneyCellModels);
        notifyDataSetChanged();

    }

    public void appData(List<MoneyCellModel> moneyCellModels) {
        this.moneyCellModels.addAll(moneyCellModels);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MoneyViemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MoneyViemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_money, parent, false);
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyViemHolder holder, int position) {
        holder.bind(moneyCellModels.get(position));

    }


    @Override
    public int getItemCount() {
        return moneyCellModels.size();
    }

    static class MoneyViemHolder extends RecyclerView.ViewHolder {
        TextView nameViem;
        TextView valueViem;
        public MoneyViemHolder(@NonNull View itemView) {
            super(itemView);

            nameViem = itemView.findViewById(R.id.cellMoneyNameViem);
            valueViem = itemView.findViewById(R.id.cellMoneyValueViem);
        }

        public void bind(MoneyCellModel moneyCellModel) {
            nameViem.setText(moneyCellModel.getName());
            valueViem.setText(moneyCellModel.getValue());
            valueViem.setTextColor(ContextCompat.getColor(valueViem.getContext(), moneyCellModel.getColor()));
    }
}
}
