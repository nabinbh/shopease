package com.deeplock.shopease;

import java.util.Date;

/**
 * Created by nabinbhattarai on 8/27/16.
 */
public class ShoppingItem
{
    private Date mDate;
    private String mTitle;
    private Float mQuantity;

    public Float getQuantity() {
        return mQuantity;
    }

    public void setQuantity(Float quantity) {
        mQuantity = quantity;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
