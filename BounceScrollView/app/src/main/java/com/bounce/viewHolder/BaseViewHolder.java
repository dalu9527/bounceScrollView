package com.bounce.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

/**
 * viewHolder 的基类
 * @author xxoo
 * @date 5/12/2016.
 */
public class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }
    /**
     * 数据
     * @param data
     */
    public void setData(List<T> data){}

}
