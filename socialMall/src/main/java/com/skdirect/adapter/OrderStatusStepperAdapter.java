package com.skdirect.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.skdirect.BuildConfig;
import com.skdirect.R;
import com.skdirect.databinding.ItemDetailsItemBinding;
import com.skdirect.databinding.ItemOrderStatusBinding;
import com.skdirect.model.OrderItemModel;
import com.skdirect.model.OrderStatusDC;
import com.skdirect.utils.MyApplication;
import com.skdirect.utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class OrderStatusStepperAdapter extends RecyclerView.Adapter<OrderStatusStepperAdapter.ViewHolder> {

    private Context context;
    private ArrayList<OrderStatusDC> OrderStatusDCList;

    public OrderStatusStepperAdapter(Context context, ArrayList<OrderStatusDC> itemModels) {
        this.context = context;
        this.OrderStatusDCList = itemModels;
    }

    @NonNull
    @Override
    public OrderStatusStepperAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_order_status, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull OrderStatusStepperAdapter.ViewHolder holder, int position) {
        OrderStatusDC orderStatusDC = OrderStatusDCList.get(position);

        holder.mBinding.tvStatus.setText(orderStatusDC.getStatus());
        holder.mBinding.tvStatusDate.setText(Utils.getDateFormate(orderStatusDC.getCreatedDate()));
        if (OrderStatusDCList.size()==(position+1)){
            holder.mBinding.viewLine.setVisibility(View.GONE);
        }else {
            holder.mBinding.viewLine.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return OrderStatusDCList == null ? 0 : OrderStatusDCList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOrderStatusBinding mBinding;

        public ViewHolder(ItemOrderStatusBinding Binding) {
            super(Binding.getRoot());
            this.mBinding = Binding;
        }
    }
}
