/*
  This class has been generated by the Code Generator
*/

package com.orderdb;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;


public abstract class Order_x0020_DetailsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_OrderID = "OrderID";
    public final static String ATTR_ProductID = "ProductID";
    public final static String ATTR_UnitPrice = "UnitPrice";
    public final static String ATTR_Quantity = "Quantity";
    public final static String ATTR_Discount = "Discount";
    private final static String REL_OrderIDObject = "FK:Order_x0020_Details[OrderID]:Orders[OrderID]";
    private final static String REL_ProductIDObject = "FK:Order_x0020_Details[ProductID]:Products[ProductID]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(Order_x0020_Details.class);
            s_classInfo.setTableName("Order_x0020_Details");
            s_classInfo.setUIDElements(new String[]{ATTR_OrderID, ATTR_ProductID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_OrderID);
                ai.setJavaName("OrderID");
                ai.setColumnName("OrderID");
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_OrderID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ProductID);
                ai.setJavaName("ProductID");
                ai.setColumnName("ProductID");
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_ProductID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UnitPrice);
                ai.setJavaName("UnitPrice");
                ai.setColumnName("UnitPrice");
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_UnitPrice);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Quantity);
                ai.setJavaName("Quantity");
                ai.setColumnName("Quantity");
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_Quantity);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Discount);
                ai.setJavaName("Discount");
                ai.setColumnName("Discount");
                ai.setAttributeClass(float.class);
                NumberValidator v = new NumberValidator(ATTR_Discount);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation OrderIDObject (FK:Order_x0020_Details[OrderID]:Orders[OrderID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_OrderIDObject);
                ri.setName("OrderIDObject");
                ri.setLocalAttributes(new String[]{"OrderID"});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.orderdb.Orders.class);
                ri.setRelatedAttributes(new String[]{"OrderID"});
                ri.setRelatedIdentifier("FK:Orders[OrderID]:Order_x0020_Details[OrderID]");
                ri.setLoadMethod("loadOrderIDObject");
                s_classInfo.addRelationInfo(ri);
            }
            {
                // relation ProductIDObject (FK:Order_x0020_Details[ProductID]:Products[ProductID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_ProductIDObject);
                ri.setName("ProductIDObject");
                ri.setLocalAttributes(new String[]{"ProductID"});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.orderdb.Products.class);
                ri.setRelatedAttributes(new String[]{"ProductID"});
                ri.setRelatedIdentifier("FK:Products[ProductID]:Order_x0020_Details[ProductID]");
                ri.setLoadMethod("loadProductIDObject");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public Order_x0020_DetailsBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getOrderID()
    {
        return getIntProperty(ATTR_OrderID);
    }

    public void setOrderID(int value)
    {
        String[] relations = new String[]{REL_OrderIDObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_OrderID, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public int getProductID()
    {
        return getIntProperty(ATTR_ProductID);
    }

    public void setProductID(int value)
    {
        String[] relations = new String[]{REL_ProductIDObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_ProductID, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public double getUnitPrice()
    {
        return getDoubleProperty(ATTR_UnitPrice);
    }

    public void setUnitPrice(double value)
    {
        setProperty(ATTR_UnitPrice, value, 0);
    }

    public short getQuantity()
    {
        return getShortProperty(ATTR_Quantity);
    }

    public void setQuantity(short value)
    {
        setProperty(ATTR_Quantity, value, 0);
    }

    public float getDiscount()
    {
        return getFloatProperty(ATTR_Discount);
    }

    public void setDiscount(float value)
    {
        setProperty(ATTR_Discount, value, 0);
    }

    public Orders getOrderIDObject()
    {
        return (Orders)getSingleRelationObject(REL_OrderIDObject);
    }
    public Orders loadOrderIDObject()
    {
        String queryText = "select * from \"Orders\" where \"OrderID\" = :OrderID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("OrderID", "Orders.OrderID", QueryObject.PARAM_INT, new Integer(getOrderID()));
        query.setResultClass(Orders.class);
        return (Orders)query.getObject();
    }


    public void setOrderIDObject(Orders a_Orders)
    {
        if (a_Orders == null)
        {
            this.setNull("OrderID");
        }
        else
        {
            this.setOrderID(a_Orders.getOrderID());
        }
    }

    public Products getProductIDObject()
    {
        return (Products)getSingleRelationObject(REL_ProductIDObject);
    }
    public Products loadProductIDObject()
    {
        String queryText = "select * from \"Products\" where \"ProductID\" = :ProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(getProductID()));
        query.setResultClass(Products.class);
        return (Products)query.getObject();
    }


    public void setProductIDObject(Products a_Products)
    {
        if (a_Products == null)
        {
            this.setNull("ProductID");
        }
        else
        {
            this.setProductID(a_Products.getProductID());
        }
    }

    public void setNull(String element)
    {
        super.setNull(element);
        if (ATTR_OrderID.equals(element))
        {
            this.updateSingleRelation(REL_OrderIDObject, false);
        }
        else if (ATTR_ProductID.equals(element))
        {
            this.updateSingleRelation(REL_ProductIDObject, false);
        }
    }
    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getNextOrder_x0020_DetailsObjects(int OrderID, int ProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Order Details\" where (\"OrderID\" > :OrderID) or (\"OrderID\" = :OrderID and \"ProductID\" > :ProductID) order by \"OrderID\" asc, \"ProductID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("OrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(OrderID));
        query.addParameter("ProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Order_x0020_Details.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.orderdb.Order_x0020_Details getOrder_x0020_DetailsObject(int OrderID, int ProductID)
    {
        String queryText = "select * from \"Order Details\" where \"OrderID\" = :OrderID and \"ProductID\" = :ProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("OrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(OrderID));
        query.addParameter("ProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Order_x0020_Details.class);
        return (Order_x0020_Details)query.getObject();
    }

    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getOrder_x0020_DetailsObjects(int fromOrderID, int toOrderID, int fromProductID, int toProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Order Details\" where \"OrderID\" between :fromOrderID and :toOrderID and \"ProductID\" between :fromProductID and :toProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromOrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(fromOrderID));
        query.addParameter("toOrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(toOrderID));
        query.addParameter("fromProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(fromProductID));
        query.addParameter("toProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(toProductID));
        query.setResultClass(Order_x0020_Details.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getOrder_x0020_DetailsObjects(int fromOrderID, int toOrderID, int fromProductID, int toProductID)
    {
        String queryText = "select * from \"Order Details\" where \"OrderID\" between :fromOrderID and :toOrderID and \"ProductID\" between :fromProductID and :toProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromOrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(fromOrderID));
        query.addParameter("toOrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(toOrderID));
        query.addParameter("fromProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(fromProductID));
        query.addParameter("toProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(toProductID));
        query.setResultClass(Order_x0020_Details.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getOrder_x0020_DetailsObjectsForOrderID(int OrderID)
    {
        String queryText = "select * from \"Order Details\" where \"OrderID\" = :OrderID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("OrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(OrderID));
        query.setResultClass(Order_x0020_Details.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getOrder_x0020_DetailsObjectsForProductID(int ProductID)
    {
        String queryText = "select * from \"Order Details\" where \"ProductID\" = :ProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Order_x0020_Details.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.orderdb.Order_x0020_Details> getPreviousOrder_x0020_DetailsObjects(int OrderID, int ProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Order Details\" where (\"OrderID\" < :OrderID) or (\"OrderID\" = :OrderID and \"ProductID\" < :ProductID) order by \"OrderID\" desc, \"ProductID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("OrderID", "Order Details.OrderID", QueryObject.PARAM_INT, new Integer(OrderID));
        query.addParameter("ProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Order_x0020_Details.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

}