package test.javareact.common.packets.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Value implements Serializable {
  private static final long serialVersionUID = -4909992361317067576L;

  private final int intVal;
  private final double doubleVal;
  private final String stringVal;
  private final boolean boolVal;
  private List listVal;
  private  ValueType type;

  public Value(int val) {
    intVal = val;
    doubleVal = 0;
    stringVal = null;
    boolVal = false;
    listVal = null;
    type = ValueType.INT;
  }

  public Value(double val) {
    intVal = 0;
    doubleVal = val;
    stringVal = null;
    boolVal = false;
    listVal = null;
    type = ValueType.DOUBLE;
  }

  public Value(String val) {
    intVal = 0;
    doubleVal = 0;
    stringVal = val;
    boolVal = false;
    listVal = null;
    type = ValueType.STRING;
  }

  public Value(boolean val) {
    intVal = 0;
    doubleVal = 0;
    stringVal = null;
    boolVal = val;
    listVal = null;
    type = ValueType.BOOL;
  }
  
  public Value(List<?> val) {
	    intVal = 0;
	    doubleVal = 0;
	    stringVal = null;
	    boolVal = false;
	    listVal = val;
	    type = ValueType.LIST;
	  }
	
  
public final ValueType getType() {
    return type;
  }

  public final int intVal() {
    return intVal;
  }

  public final double doubleVal() {
    if (type == ValueType.INT){ 
	  return (double)intVal;
    }
    else return doubleVal; 
  }

  public final String stringVal() {
    return stringVal;
  }

  public final boolean boolVal() {
    return boolVal;
  }
  
  public final List listVal() {
	    return listVal;
	  }
  



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (boolVal ? 1231 : 1237);
	long temp;
	temp = Double.doubleToLongBits(doubleVal);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + intVal;
	result = prime * result + ((listVal == null) ? 0 : listVal.hashCode());
	result = prime * result + ((stringVal == null) ? 0 : stringVal.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Value other = (Value) obj;
	if (boolVal != other.boolVal)
		return false;
	if (Double.doubleToLongBits(doubleVal) != Double
			.doubleToLongBits(other.doubleVal))
		return false;
	if (intVal != other.intVal)
		return false;
	if (listVal == null) {
		if (other.listVal != null)
			return false;
	} else if (!listVal.equals(other.listVal))
		return false;
	if (stringVal == null) {
		if (other.stringVal != null)
			return false;
	} else if (!stringVal.equals(other.stringVal))
		return false;
	if (type != other.type)
		return false;
	return true;
}

@Override
  public String toString() {
    switch (type) {
    case INT:
      return String.valueOf(intVal);
    case DOUBLE:
      return String.valueOf(doubleVal);
    case STRING:
      return stringVal;
    case BOOL:
      return String.valueOf(boolVal);
    case LIST:
      return listVal.toString(); 
    default:
      assert false : type;
      return "err";
    }
  }



}
