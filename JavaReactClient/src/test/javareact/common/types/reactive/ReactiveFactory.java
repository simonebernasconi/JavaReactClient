package test.javareact.common.types.reactive;

import test.javareact.common.packets.content.Value;

public final class ReactiveFactory {

	public static final ReactiveInteger getInteger(String expression,
			int startingValue, String name, boolean isPublic) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			int startingValue, String name) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			String name, boolean isPublic) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			String name) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, name, true);
		return result;
	}

//	public static final ReactiveListInteger getListInt(String expression,
//			List<Integer> startingValue, String name, boolean isPublic) {
//		ReactiveListInteger result = new ReactiveListIntegerImpl(expression, new Value(startingValue, ValueType.LISTINT), name, isPublic);
//		return result;
//	}
//
//	public static final ReactiveListInteger getListInt(String expression, String name) {
//		ReactiveListInteger result = new ReactiveListIntegerImpl(expression, ValueType.LISTINT), name, true);
//		return result;
//	}
//
//	public static final ReactiveListInteger getListInt(String expression,
//			String name, boolean isPublic) {
//		ReactiveListInteger result = new ReactiveListIntegerImpl(expression, name,
//				isPublic);
//		return result;
//	}
//
//	public static final ReactiveListInteger getListInt(String expression,
//			String name) {
//		ReactiveListInteger result = new ReactiveListIntegerImpl(expression, name, true);
//		return result;
//	}
//
//	public static final ReactiveListDouble getListDouble(String expression,
//			List<Double> startingValue, String name, boolean isPublic) {
//		ReactiveListDouble result = new ReactiveListDoubleImpl(expression, new Value(
//				startingValue,ValueType.LISTDOUBLE), name, isPublic);
//		return result;
//	}
//
//	public static final ReactiveListDouble getListDouble(String expression,
//			List<Double> startingValue, String name) {
//		ReactiveListDouble result = new ReactiveListDoubleImpl(expression, new Value(
//				startingValue,ValueType.LISTDOUBLE), name, true);
//		return result;
//	}
//
//	public static final ReactiveListDouble getListDouble(String expression,
//			String name, boolean isPublic) {
//		ReactiveListDouble result = new ReactiveListDoubleImpl(expression, name,
//				isPublic);
//		return result;
//	}
//
//	public static final ReactiveListDouble getListDouble(String expression,
//			String name) {
//		ReactiveListDouble result = new ReactiveListDoubleImpl(expression, name, true);
//		return result;
//	}
//
//	public static final ReactiveListString getListString(String expression,
//			List<String> startingValue, String name, boolean isPublic) {
//		ReactiveListString result = new ReactiveListStringImpl(expression, new Value(
//				startingValue,ValueType.LISTSTRING), name, isPublic);
//		return result;
//	}
//
//	public static final ReactiveListString getListString(String expression,
//			List<String> startingValue, String name) {
//		ReactiveListString result = new ReactiveListStringImpl(expression, new Value(
//				startingValue,ValueType.LISTSTRING), name, true);
//		return result;
//	}
//
//	public static final ReactiveListString getListString(String expression,
//			String name, boolean isPublic) {
//		ReactiveListString result = new ReactiveListStringImpl(expression, name,
//				isPublic);
//		return result;
//	}
//
//	public static final ReactiveListString getListString(String expression,
//			String name) {
//		ReactiveListString result = new ReactiveListStringImpl(expression, name, true);
//		return result;
//	}
//
//	public static final ReactiveListBool getListBool(String expression,
//			List<Boolean> startingValue, String name, boolean isPublic) {
//		ReactiveListBool result = new ReactiveListBoolImpl(expression, new Value(
//				startingValue,ValueType.LISTBOOL), name, isPublic);
//		return result;
//	}
//
//	public static final ReactiveListBool getListBool(String expression,
//			List<Boolean> startingValue, String name) {
//		ReactiveListBool result = new ReactiveListBoolImpl(expression, new Value(
//				startingValue,ValueType.LISTBOOL), name, true);
//		return result;
//	}
//
//	public static final ReactiveListBool getListBool(String expression,
//			String name, boolean isPublic) {
//		ReactiveListBool result = new ReactiveListBoolImpl(expression, name,
//				isPublic);
//		return result;
//	}
//
//	public static final ReactiveListBool getListBool(String expression,
//			String name) {
//		ReactiveListBool result = new ReactiveListBoolImpl(expression, name, true);
//		return result;
//	}
	
	public static final ReactiveDouble getDouble(String expression,
			double startingValue, String name, boolean isPublic) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression,
			double startingValue, String name) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression,
			String name, boolean isPublic) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression, String name) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, name, true);
		return result;
	}

	public static final ReactiveBool getBool(String expression,
			boolean startingValue, String name, boolean isPublic) {
		ReactiveBool result = new ReactiveBoolImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveBool getBool(String expression,
			boolean startingValue, String name) {
		ReactiveBool result = new ReactiveBoolImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveBool getBool(String expression, String name,
			boolean isPublic) {
		ReactiveBool result = new ReactiveBoolImpl(expression, name, isPublic);
		return result;
	}

	public static final ReactiveBool getBool(String expression, String name) {
		ReactiveBool result = new ReactiveBoolImpl(expression, name, true);
		return result;
	}

	public static final ReactiveString getString(String expression,
			String startingValue, String name, boolean isPublic) {
		ReactiveString result = new ReactiveStringImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveString getString(String expression,
			String startingValue, String name) {
		ReactiveString result = new ReactiveStringImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveString getString(String expression,
			String name, boolean isPublic) {
		ReactiveString result = new ReactiveStringImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveString getString(String expression, String name) {
		ReactiveString result = new ReactiveStringImpl(expression, name, true);
		return result;
	}

}