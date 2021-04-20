package com.skdirect.model;

import com.google.gson.annotations.SerializedName;

public class CartMainModel {
    @SerializedName("IsSuccess")
    private boolean IsSuccess;

    @SerializedName("ResultItem")
    private CartItemModel ResultItem;

    @SerializedName("SuccessMessage")
    private String SuccessMessage;

    @SerializedName("ErrorMessage")
    private String ErrorMessage;

    public boolean isSuccess() {
        return IsSuccess;
    }

    public void setSuccess(boolean success) {
        IsSuccess = success;
    }

    public CartItemModel getResultItem() {
        return ResultItem;
    }

    public void setResultItem(CartItemModel resultItem) {
        ResultItem = resultItem;
    }

    public String getSuccessMessage() {
        return SuccessMessage;
    }

    public void setSuccessMessage(String successMessage) {
        SuccessMessage = successMessage;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
