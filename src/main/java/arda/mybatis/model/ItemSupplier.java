package arda.mybatis.model;

import javax.enterprise.inject.Model;

public class ItemSupplier {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ITEM_SUPPLIER.SUPPLIER_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    private Integer supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ITEM_SUPPLIER.ITEM_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    private Integer itemId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ITEM_SUPPLIER.SUPPLIER_ID
     *
     * @return the value of PUBLIC.ITEM_SUPPLIER.SUPPLIER_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ITEM_SUPPLIER.SUPPLIER_ID
     *
     * @param supplierId the value for PUBLIC.ITEM_SUPPLIER.SUPPLIER_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ITEM_SUPPLIER.ITEM_ID
     *
     * @return the value of PUBLIC.ITEM_SUPPLIER.ITEM_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ITEM_SUPPLIER.ITEM_ID
     *
     * @param itemId the value for PUBLIC.ITEM_SUPPLIER.ITEM_ID
     *
     * @mbg.generated Tue Apr 28 15:47:20 EEST 2020
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}