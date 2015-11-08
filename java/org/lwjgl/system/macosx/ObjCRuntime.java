/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the Objective-C Runtime.
 * 
 * <p>Due to the nature of the {@code objc_msgSend*} functions, they are not directly exposed in this binding. Advanced users with good understanding of
 * the complexity involved with using these functions, may access them via the {@link #getLibrary} method:
 * <pre><code style="font-family: monospace">
 * SharedLibrary objc = ObjCRuntime.getLibrary();
 * long objc_msgSend = objc.getFunctionAddress("objc_msgSend");
 * 
 * // example usage
 * long NSThread = objc_getClass("NSThread");
 * long currentThread = invokePPP(objc_msgSend, NSThread, sel_getUid("currentThread"));</code></pre>
 * The safe way to use objc_msgSend in C code is to cast it to an appropriate function pointer. This is exactly what the
 * {@link org.lwjgl.system.JNI JNI} class does. If a particular function signature is not available, {@link org.lwjgl.system.libffi.LibFFI LibFFI} may
 * be used to invoke it.</p>
 * 
 * <p>The functions not exposed are:
 * <ul>
 * <li>objc_msgSend</li>
 * <li>objc_msgSend_stret</li>
 * <li>objc_msgSendSuper</li>
 * <li>objc_msgSendSuper_stret</li>
 * </ul></p>
 */
public class ObjCRuntime {

	/** Nil value. */
	public static final long nil = 0x0L;

	/** Boolean values. */
	public static final byte
		YES = 1,
		NO  = 0;

	/** Types. */
	public static final char
		_C_ID       = '@',
		_C_CLASS    = '#',
		_C_SEL      = ':',
		_C_CHR      = 'c',
		_C_UCHR     = 'C',
		_C_SHT      = 's',
		_C_USHT     = 'S',
		_C_INT      = 'i',
		_C_UINT     = 'I',
		_C_LNG      = 'l',
		_C_ULNG     = 'L',
		_C_LNG_LNG  = 'q',
		_C_ULNG_LNG = 'Q',
		_C_FLT      = 'f',
		_C_DBL      = 'd',
		_C_BFLD     = 'b',
		_C_BOOL     = 'B',
		_C_VOID     = 'v',
		_C_UNDEF    = '?',
		_C_PTR      = '^',
		_C_CHARPTR  = '*',
		_C_ATOM     = '%',
		_C_ARY_B    = '[',
		_C_ARY_E    = ']',
		_C_UNION_B  = '(',
		_C_UNION_E  = ')',
		_C_STRUCT_B = '{',
		_C_STRUCT_E = '}',
		_C_VECTOR   = '!',
		_C_CONST    = 'r';

	/** Policies related to associative references. */
	public static final int
		OBJC_ASSOCIATION_ASSIGN           = 0x0,
		OBJC_ASSOCIATION_RETAIN_NONATOMIC = 0x1,
		OBJC_ASSOCIATION_COPY_NONATOMIC   = 0x3,
		OBJC_ASSOCIATION_RETAIN           = 0x579,
		OBJC_ASSOCIATION_COPY             = 0x57B;

	static { Library.initialize(); }

	/** Function address. */
	@JavadocExclude
	public final long
		object_copy,
		object_dispose,
		object_getClass,
		object_setClass,
		object_getClassName,
		object_getIndexedIvars,
		object_getIvar,
		object_setIvar,
		object_setInstanceVariable,
		object_getInstanceVariable,
		objc_getClass,
		objc_getMetaClass,
		objc_lookUpClass,
		objc_getRequiredClass,
		objc_getClassList,
		objc_copyClassList,
		class_getName,
		class_isMetaClass,
		class_getSuperclass,
		class_getVersion,
		class_setVersion,
		class_getInstanceSize,
		class_getInstanceVariable,
		class_getClassVariable,
		class_copyIvarList,
		class_getInstanceMethod,
		class_getClassMethod,
		class_getMethodImplementation,
		class_respondsToSelector,
		class_copyMethodList,
		class_conformsToProtocol,
		class_copyProtocolList,
		class_getProperty,
		class_copyPropertyList,
		class_getIvarLayout,
		class_getWeakIvarLayout,
		class_addMethod,
		class_replaceMethod,
		class_addIvar,
		class_addProtocol,
		class_addProperty,
		class_replaceProperty,
		class_setIvarLayout,
		class_setWeakIvarLayout,
		class_createInstance,
		objc_constructInstance,
		objc_destructInstance,
		objc_allocateClassPair,
		objc_registerClassPair,
		objc_disposeClassPair,
		method_getName,
		method_getImplementation,
		method_getTypeEncoding,
		method_getNumberOfArguments,
		method_copyReturnType,
		method_copyArgumentType,
		method_getReturnType,
		method_getArgumentType,
		method_setImplementation,
		method_exchangeImplementations,
		ivar_getName,
		ivar_getTypeEncoding,
		ivar_getOffset,
		property_getName,
		property_getAttributes,
		property_copyAttributeList,
		property_copyAttributeValue,
		objc_getProtocol,
		objc_copyProtocolList,
		protocol_conformsToProtocol,
		protocol_isEqual,
		protocol_getName,
		protocol_getMethodDescription,
		protocol_copyMethodDescriptionList,
		protocol_getProperty,
		protocol_copyPropertyList,
		protocol_copyProtocolList,
		objc_allocateProtocol,
		objc_registerProtocol,
		protocol_addMethodDescription,
		protocol_addProtocol,
		protocol_addProperty,
		objc_copyImageNames,
		class_getImageName,
		objc_copyClassNamesForImage,
		sel_getName,
		sel_getUid,
		sel_registerName,
		sel_isEqual,
		objc_enumerationMutation,
		objc_setEnumerationMutationHandler,
		imp_implementationWithBlock,
		imp_getBlock,
		imp_removeBlock,
		objc_loadWeak,
		objc_storeWeak,
		objc_setAssociatedObject,
		objc_getAssociatedObject,
		objc_removeAssociatedObjects;

	@JavadocExclude
	protected ObjCRuntime() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public ObjCRuntime(FunctionProvider provider) {
		object_copy = checkFunctionAddress(provider.getFunctionAddress("object_copy"));
		object_dispose = checkFunctionAddress(provider.getFunctionAddress("object_dispose"));
		object_getClass = checkFunctionAddress(provider.getFunctionAddress("object_getClass"));
		object_setClass = checkFunctionAddress(provider.getFunctionAddress("object_setClass"));
		object_getClassName = checkFunctionAddress(provider.getFunctionAddress("object_getClassName"));
		object_getIndexedIvars = checkFunctionAddress(provider.getFunctionAddress("object_getIndexedIvars"));
		object_getIvar = checkFunctionAddress(provider.getFunctionAddress("object_getIvar"));
		object_setIvar = checkFunctionAddress(provider.getFunctionAddress("object_setIvar"));
		object_setInstanceVariable = checkFunctionAddress(provider.getFunctionAddress("object_setInstanceVariable"));
		object_getInstanceVariable = checkFunctionAddress(provider.getFunctionAddress("object_getInstanceVariable"));
		objc_getClass = checkFunctionAddress(provider.getFunctionAddress("objc_getClass"));
		objc_getMetaClass = checkFunctionAddress(provider.getFunctionAddress("objc_getMetaClass"));
		objc_lookUpClass = checkFunctionAddress(provider.getFunctionAddress("objc_lookUpClass"));
		objc_getRequiredClass = checkFunctionAddress(provider.getFunctionAddress("objc_getRequiredClass"));
		objc_getClassList = checkFunctionAddress(provider.getFunctionAddress("objc_getClassList"));
		objc_copyClassList = checkFunctionAddress(provider.getFunctionAddress("objc_copyClassList"));
		class_getName = checkFunctionAddress(provider.getFunctionAddress("class_getName"));
		class_isMetaClass = checkFunctionAddress(provider.getFunctionAddress("class_isMetaClass"));
		class_getSuperclass = checkFunctionAddress(provider.getFunctionAddress("class_getSuperclass"));
		class_getVersion = checkFunctionAddress(provider.getFunctionAddress("class_getVersion"));
		class_setVersion = checkFunctionAddress(provider.getFunctionAddress("class_setVersion"));
		class_getInstanceSize = checkFunctionAddress(provider.getFunctionAddress("class_getInstanceSize"));
		class_getInstanceVariable = checkFunctionAddress(provider.getFunctionAddress("class_getInstanceVariable"));
		class_getClassVariable = checkFunctionAddress(provider.getFunctionAddress("class_getClassVariable"));
		class_copyIvarList = checkFunctionAddress(provider.getFunctionAddress("class_copyIvarList"));
		class_getInstanceMethod = checkFunctionAddress(provider.getFunctionAddress("class_getInstanceMethod"));
		class_getClassMethod = checkFunctionAddress(provider.getFunctionAddress("class_getClassMethod"));
		class_getMethodImplementation = checkFunctionAddress(provider.getFunctionAddress("class_getMethodImplementation"));
		class_respondsToSelector = checkFunctionAddress(provider.getFunctionAddress("class_respondsToSelector"));
		class_copyMethodList = checkFunctionAddress(provider.getFunctionAddress("class_copyMethodList"));
		class_conformsToProtocol = checkFunctionAddress(provider.getFunctionAddress("class_conformsToProtocol"));
		class_copyProtocolList = checkFunctionAddress(provider.getFunctionAddress("class_copyProtocolList"));
		class_getProperty = checkFunctionAddress(provider.getFunctionAddress("class_getProperty"));
		class_copyPropertyList = checkFunctionAddress(provider.getFunctionAddress("class_copyPropertyList"));
		class_getIvarLayout = checkFunctionAddress(provider.getFunctionAddress("class_getIvarLayout"));
		class_getWeakIvarLayout = checkFunctionAddress(provider.getFunctionAddress("class_getWeakIvarLayout"));
		class_addMethod = checkFunctionAddress(provider.getFunctionAddress("class_addMethod"));
		class_replaceMethod = checkFunctionAddress(provider.getFunctionAddress("class_replaceMethod"));
		class_addIvar = checkFunctionAddress(provider.getFunctionAddress("class_addIvar"));
		class_addProtocol = checkFunctionAddress(provider.getFunctionAddress("class_addProtocol"));
		class_addProperty = checkFunctionAddress(provider.getFunctionAddress("class_addProperty"));
		class_replaceProperty = checkFunctionAddress(provider.getFunctionAddress("class_replaceProperty"));
		class_setIvarLayout = checkFunctionAddress(provider.getFunctionAddress("class_setIvarLayout"));
		class_setWeakIvarLayout = checkFunctionAddress(provider.getFunctionAddress("class_setWeakIvarLayout"));
		class_createInstance = checkFunctionAddress(provider.getFunctionAddress("class_createInstance"));
		objc_constructInstance = checkFunctionAddress(provider.getFunctionAddress("objc_constructInstance"));
		objc_destructInstance = checkFunctionAddress(provider.getFunctionAddress("objc_destructInstance"));
		objc_allocateClassPair = checkFunctionAddress(provider.getFunctionAddress("objc_allocateClassPair"));
		objc_registerClassPair = checkFunctionAddress(provider.getFunctionAddress("objc_registerClassPair"));
		objc_disposeClassPair = checkFunctionAddress(provider.getFunctionAddress("objc_disposeClassPair"));
		method_getName = checkFunctionAddress(provider.getFunctionAddress("method_getName"));
		method_getImplementation = checkFunctionAddress(provider.getFunctionAddress("method_getImplementation"));
		method_getTypeEncoding = checkFunctionAddress(provider.getFunctionAddress("method_getTypeEncoding"));
		method_getNumberOfArguments = checkFunctionAddress(provider.getFunctionAddress("method_getNumberOfArguments"));
		method_copyReturnType = checkFunctionAddress(provider.getFunctionAddress("method_copyReturnType"));
		method_copyArgumentType = checkFunctionAddress(provider.getFunctionAddress("method_copyArgumentType"));
		method_getReturnType = checkFunctionAddress(provider.getFunctionAddress("method_getReturnType"));
		method_getArgumentType = checkFunctionAddress(provider.getFunctionAddress("method_getArgumentType"));
		method_setImplementation = checkFunctionAddress(provider.getFunctionAddress("method_setImplementation"));
		method_exchangeImplementations = checkFunctionAddress(provider.getFunctionAddress("method_exchangeImplementations"));
		ivar_getName = checkFunctionAddress(provider.getFunctionAddress("ivar_getName"));
		ivar_getTypeEncoding = checkFunctionAddress(provider.getFunctionAddress("ivar_getTypeEncoding"));
		ivar_getOffset = checkFunctionAddress(provider.getFunctionAddress("ivar_getOffset"));
		property_getName = checkFunctionAddress(provider.getFunctionAddress("property_getName"));
		property_getAttributes = checkFunctionAddress(provider.getFunctionAddress("property_getAttributes"));
		property_copyAttributeList = checkFunctionAddress(provider.getFunctionAddress("property_copyAttributeList"));
		property_copyAttributeValue = checkFunctionAddress(provider.getFunctionAddress("property_copyAttributeValue"));
		objc_getProtocol = checkFunctionAddress(provider.getFunctionAddress("objc_getProtocol"));
		objc_copyProtocolList = checkFunctionAddress(provider.getFunctionAddress("objc_copyProtocolList"));
		protocol_conformsToProtocol = checkFunctionAddress(provider.getFunctionAddress("protocol_conformsToProtocol"));
		protocol_isEqual = checkFunctionAddress(provider.getFunctionAddress("protocol_isEqual"));
		protocol_getName = checkFunctionAddress(provider.getFunctionAddress("protocol_getName"));
		protocol_getMethodDescription = checkFunctionAddress(provider.getFunctionAddress("protocol_getMethodDescription"));
		protocol_copyMethodDescriptionList = checkFunctionAddress(provider.getFunctionAddress("protocol_copyMethodDescriptionList"));
		protocol_getProperty = checkFunctionAddress(provider.getFunctionAddress("protocol_getProperty"));
		protocol_copyPropertyList = checkFunctionAddress(provider.getFunctionAddress("protocol_copyPropertyList"));
		protocol_copyProtocolList = checkFunctionAddress(provider.getFunctionAddress("protocol_copyProtocolList"));
		objc_allocateProtocol = checkFunctionAddress(provider.getFunctionAddress("objc_allocateProtocol"));
		objc_registerProtocol = checkFunctionAddress(provider.getFunctionAddress("objc_registerProtocol"));
		protocol_addMethodDescription = checkFunctionAddress(provider.getFunctionAddress("protocol_addMethodDescription"));
		protocol_addProtocol = checkFunctionAddress(provider.getFunctionAddress("protocol_addProtocol"));
		protocol_addProperty = checkFunctionAddress(provider.getFunctionAddress("protocol_addProperty"));
		objc_copyImageNames = checkFunctionAddress(provider.getFunctionAddress("objc_copyImageNames"));
		class_getImageName = checkFunctionAddress(provider.getFunctionAddress("class_getImageName"));
		objc_copyClassNamesForImage = checkFunctionAddress(provider.getFunctionAddress("objc_copyClassNamesForImage"));
		sel_getName = checkFunctionAddress(provider.getFunctionAddress("sel_getName"));
		sel_getUid = checkFunctionAddress(provider.getFunctionAddress("sel_getUid"));
		sel_registerName = checkFunctionAddress(provider.getFunctionAddress("sel_registerName"));
		sel_isEqual = checkFunctionAddress(provider.getFunctionAddress("sel_isEqual"));
		objc_enumerationMutation = checkFunctionAddress(provider.getFunctionAddress("objc_enumerationMutation"));
		objc_setEnumerationMutationHandler = checkFunctionAddress(provider.getFunctionAddress("objc_setEnumerationMutationHandler"));
		imp_implementationWithBlock = checkFunctionAddress(provider.getFunctionAddress("imp_implementationWithBlock"));
		imp_getBlock = checkFunctionAddress(provider.getFunctionAddress("imp_getBlock"));
		imp_removeBlock = checkFunctionAddress(provider.getFunctionAddress("imp_removeBlock"));
		objc_loadWeak = checkFunctionAddress(provider.getFunctionAddress("objc_loadWeak"));
		objc_storeWeak = checkFunctionAddress(provider.getFunctionAddress("objc_storeWeak"));
		objc_setAssociatedObject = checkFunctionAddress(provider.getFunctionAddress("objc_setAssociatedObject"));
		objc_getAssociatedObject = checkFunctionAddress(provider.getFunctionAddress("objc_getAssociatedObject"));
		objc_removeAssociatedObjects = checkFunctionAddress(provider.getFunctionAddress("objc_removeAssociatedObjects"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary OBJC;

	private static final ObjCRuntime instance;

	static {
		OBJC = Library.loadNative("objc");
		instance = new ObjCRuntime(OBJC);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return OBJC;
	}

	/** Returns the {@link ObjCRuntime} instance. */
	public static ObjCRuntime getInstance() {
		return instance;
	}

	// --- [ object_copy ] ---

	/**
	 * Returns a copy of a given object.
	 *
	 * @param obj  an Objective-C object
	 * @param size the size of the object {@code obj}
	 *
	 * @return a copy of obj
	 */
	public static long object_copy(long obj, long size) {
		long __functionAddress = getInstance().object_copy;
		if ( CHECKS )
			checkPointer(obj);
		return invokePPP(__functionAddress, obj, size);
	}

	// --- [ object_dispose ] ---

	/**
	 * Frees the memory occupied by a given object.
	 *
	 * @param obj an Objective-C object
	 *
	 * @return {@link #nil}
	 */
	public static long object_dispose(long obj) {
		long __functionAddress = getInstance().object_dispose;
		if ( CHECKS )
			checkPointer(obj);
		return invokePP(__functionAddress, obj);
	}

	// --- [ object_getClass ] ---

	/**
	 * Returns the class of an object.
	 *
	 * @param obj an Objective-C object
	 *
	 * @return the class object of which object is an instance, or Nil if {@code obj} is {@link #nil}
	 */
	public static long object_getClass(long obj) {
		long __functionAddress = getInstance().object_getClass;
		return invokePP(__functionAddress, obj);
	}

	// --- [ object_setClass ] ---

	/**
	 * Sets the class of an object.
	 *
	 * @param obj the object to modify
	 * @param cls a class object
	 *
	 * @return the previous value of object's class, or Nil if {@code obj} is {@link #nil}
	 */
	public static long object_setClass(long obj, long cls) {
		long __functionAddress = getInstance().object_setClass;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPP(__functionAddress, obj, cls);
	}

	// --- [ object_getClassName ] ---

	/** Unsafe version of {@link #object_getClassName} */
	@JavadocExclude
	public static long nobject_getClassName(long obj) {
		long __functionAddress = getInstance().object_getClassName;
		return invokePP(__functionAddress, obj);
	}

	/**
	 * Returns the class name of a given object.
	 *
	 * @param obj an Objective-C object
	 *
	 * @return the name of the class of which {@code obj} is an instance
	 */
	public static String object_getClassName(long obj) {
		long __result = nobject_getClassName(obj);
		return memDecodeUTF8(__result);
	}

	// --- [ object_getIndexedIvars ] ---

	/**
	 * This function returns a pointer to any extra bytes allocated with the instance (as specified by {@link #class_createInstance} with extraBytes&gt;0). This
	 * memory follows the object's ordinary ivars, but may not be adjacent to the last ivar.
	 * 
	 * <p>The returned pointer is guaranteed to be pointer-size aligned, even if the area following the object's last ivar is less aligned than that. Alignment
	 * greater than pointer-size is never guaranteed, even if the area following the object's last ivar is more aligned than that.</p>
	 * 
	 * <p>In a garbage-collected environment, the memory is scanned conservatively.</p>
	 *
	 * @param obj an Objective-C object
	 *
	 * @return a pointer to any extra bytes allocated with {@code obj}. If {@code obj} was not allocated with any extra bytes, then dereferencing the returned pointer
	 *         is undefined.
	 */
	public static long object_getIndexedIvars(long obj) {
		long __functionAddress = getInstance().object_getIndexedIvars;
		if ( CHECKS )
			checkPointer(obj);
		return invokePP(__functionAddress, obj);
	}

	// --- [ object_getIvar ] ---

	/**
	 * Reads the value of an instance variable in an object.
	 *
	 * @param obj  the object containing the instance variable whose value you want to read
	 * @param ivar the Ivar describing the instance variable whose value you want to read
	 *
	 * @return the value of the instance variable specified by {@code ivar}, or {@link #nil} if {@code obj} is {@link #nil}
	 */
	public static long object_getIvar(long obj, long ivar) {
		long __functionAddress = getInstance().object_getIvar;
		if ( CHECKS )
			checkPointer(ivar);
		return invokePPP(__functionAddress, obj, ivar);
	}

	// --- [ object_setIvar ] ---

	/**
	 * Sets the value of an instance variable in an object.
	 * 
	 * <p>object_setIvar is faster than {@link #object_setInstanceVariable} if the Ivar for the instance variable is already known.</p>
	 *
	 * @param obj   the object containing the instance variable whose value you want to set
	 * @param ivar  the Ivar describing the instance variable whose value you want to set
	 * @param value the new value for the instance variable
	 */
	public static void object_setIvar(long obj, long ivar, long value) {
		long __functionAddress = getInstance().object_setIvar;
		if ( CHECKS ) {
			checkPointer(obj);
			checkPointer(ivar);
			checkPointer(value);
		}
		invokePPPV(__functionAddress, obj, ivar, value);
	}

	// --- [ object_setInstanceVariable ] ---

	/** Unsafe version of {@link #object_setInstanceVariable} */
	@JavadocExclude
	public static long nobject_setInstanceVariable(long obj, long name, long value) {
		long __functionAddress = getInstance().object_setInstanceVariable;
		if ( CHECKS )
			checkPointer(obj);
		return invokePPPP(__functionAddress, obj, name, value);
	}

	/**
	 * Changes the value of an instance variable of a class instance.
	 *
	 * @param obj   a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to modify
	 * @param name  a C string. Pass the name of the instance variable whose value you wish to modify
	 * @param value the new value for the instance variable
	 *
	 * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
	 */
	public static long object_setInstanceVariable(long obj, ByteBuffer name, ByteBuffer value) {
		if ( CHECKS )
			checkNT1(name);
		return nobject_setInstanceVariable(obj, memAddress(name), memAddress(value));
	}

	/** CharSequence version of: {@link #object_setInstanceVariable} */
	public static long object_setInstanceVariable(long obj, CharSequence name, ByteBuffer value) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobject_setInstanceVariable(obj, __buffer.address(nameEncoded), memAddress(value));
	}

	// --- [ object_getInstanceVariable ] ---

	/** Unsafe version of {@link #object_getInstanceVariable} */
	@JavadocExclude
	public static long nobject_getInstanceVariable(long obj, long name, long outValue) {
		long __functionAddress = getInstance().object_getInstanceVariable;
		if ( CHECKS )
			checkPointer(obj);
		return invokePPPP(__functionAddress, obj, name, outValue);
	}

	/**
	 * Obtains the value of an instance variable of a class instance.
	 *
	 * @param obj      a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to obtain
	 * @param name     a C string. Pass the name of the instance variable whose value you wish to obtain
	 * @param outValue on return, contains a pointer to the value of the instance variable
	 *
	 * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
	 */
	public static long object_getInstanceVariable(long obj, ByteBuffer name, ByteBuffer outValue) {
		if ( CHECKS )
			checkNT1(name);
		return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
	}

	/** Alternative version of: {@link #object_getInstanceVariable} */
	public static long object_getInstanceVariable(long obj, ByteBuffer name, PointerBuffer outValue) {
		return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
	}

	/** CharSequence version of: {@link #object_getInstanceVariable} */
	public static long object_getInstanceVariable(long obj, CharSequence name, PointerBuffer outValue) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobject_getInstanceVariable(obj, __buffer.address(nameEncoded), memAddress(outValue));
	}

	// --- [ objc_getClass ] ---

	/** Unsafe version of {@link #objc_getClass} */
	@JavadocExclude
	public static long nobjc_getClass(long name) {
		long __functionAddress = getInstance().objc_getClass;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Returns the class definition of a specified class.
	 * 
	 * <p>objc_getClass is different from {@link #objc_lookUpClass} in that if the class is not registered, objc_getClass calls the class handler callback and then
	 * checks a second time to see whether the class is registered. objc_lookUpClass does not call the class handler callback.</p>
	 *
	 * @param name the name of the class to look up
	 *
	 * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
	 */
	public static long objc_getClass(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_getClass(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_getClass} */
	public static long objc_getClass(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_getClass(__buffer.address(nameEncoded));
	}

	// --- [ objc_getMetaClass ] ---

	/** Unsafe version of {@link #objc_getMetaClass} */
	@JavadocExclude
	public static long nobjc_getMetaClass(long name) {
		long __functionAddress = getInstance().objc_getMetaClass;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Returns the metaclass definition of a specified class.
	 * 
	 * <p>If the definition for the named class is not registered, this function calls the class handler callback and then checks a second time to see if the
	 * class is registered. However, every class definition must have a valid metaclass definition, and so the metaclass definition is always returned,
	 * whether it’s valid or not.</p>
	 *
	 * @param name the name of the class to look up
	 *
	 * @return the Class object for the metaclass of the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
	 */
	public static long objc_getMetaClass(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_getMetaClass(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_getMetaClass} */
	public static long objc_getMetaClass(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_getMetaClass(__buffer.address(nameEncoded));
	}

	// --- [ objc_lookUpClass ] ---

	/** Unsafe version of {@link #objc_lookUpClass} */
	@JavadocExclude
	public static long nobjc_lookUpClass(long name) {
		long __functionAddress = getInstance().objc_lookUpClass;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Returns the class definition of a specified class.
	 * 
	 * <p>{@link #objc_getClass} is different from this function in that if the class is not registered, objc_getClass calls the class handler callback and then checks
	 * a second time to see whether the class is registered. This function does not call the class handler callback.</p>
	 *
	 * @param name the name of the class to look up
	 *
	 * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
	 */
	public static long objc_lookUpClass(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_lookUpClass(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_lookUpClass} */
	public static long objc_lookUpClass(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_lookUpClass(__buffer.address(nameEncoded));
	}

	// --- [ objc_getRequiredClass ] ---

	/** Unsafe version of {@link #objc_getRequiredClass} */
	@JavadocExclude
	public static long nobjc_getRequiredClass(long name) {
		long __functionAddress = getInstance().objc_getRequiredClass;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Returns the class definition of a specified class.
	 * 
	 * <p>This function is the same as {@link #objc_getClass}, but kills the process if the class is not found.</p>
	 * 
	 * <p>This function is used by ZeroLink, where failing to find a class would be a compile-time link error without ZeroLink.</p>
	 *
	 * @param name the name of the class to look up
	 *
	 * @return the Class object for the named class
	 */
	public static long objc_getRequiredClass(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_getRequiredClass(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_getRequiredClass} */
	public static long objc_getRequiredClass(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_getRequiredClass(__buffer.address(nameEncoded));
	}

	// --- [ objc_getClassList ] ---

	/** Unsafe version of {@link #objc_getClassList} */
	@JavadocExclude
	public static int nobjc_getClassList(long buffer, int bufferCount) {
		long __functionAddress = getInstance().objc_getClassList;
		return invokePII(__functionAddress, buffer, bufferCount);
	}

	/**
	 * Obtains the list of registered class definitions.
	 * 
	 * <p>The Objective-C runtime library automatically registers all the classes defined in your source code. You can create class definitions at runtime and
	 * register them with the {@link #objc_allocateClassPair} and {@link #objc_registerClassPair} functions.</p>
	 * 
	 * <h3>Special Considerations</h3>
	 * You cannot assume that class objects you get from this function are classes that inherit from NSObject, so you cannot safely call any methods on such
	 * classes without detecting that the method is implemented first.
	 *
	 * @param buffer      an array of Class values. On output, each Class value points to one class definition, up to either {@code bufferCount} or the total number of
	 *                    registered classes, whichever is less. You can pass {@code NULL} to obtain the total number of registered class definitions without actually retrieving
	 *                    any class definitions.
	 * @param bufferCount the number of pointers for which you have allocated space in buffer. On return, this function fills in only this number of elements. If this number
	 *                    is less than the number of registered classes, this function returns an arbitrary subset of the registered classes.
	 *
	 * @return an integer value indicating the total number of registered classes
	 */
	public static int objc_getClassList(ByteBuffer buffer, int bufferCount) {
		if ( CHECKS )
			if ( buffer != null ) checkBuffer(buffer, bufferCount << POINTER_SHIFT);
		return nobjc_getClassList(memAddressSafe(buffer), bufferCount);
	}

	/** Alternative version of: {@link #objc_getClassList} */
	public static int objc_getClassList(PointerBuffer buffer) {
		return nobjc_getClassList(memAddressSafe(buffer), buffer == null ? 0 : buffer.remaining());
	}

	// --- [ objc_copyClassList ] ---

	/** Unsafe version of {@link #objc_copyClassList} */
	@JavadocExclude
	public static long nobjc_copyClassList(long outCount) {
		long __functionAddress = getInstance().objc_copyClassList;
		return invokePP(__functionAddress, outCount);
	}

	/**
	 * Creates and returns a list of pointers to all registered class definitions.
	 *
	 * @return a {@link #nil} terminated array of classes. You must free the array with free()
	 */
	public static PointerBuffer objc_copyClassList() {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nobjc_copyClassList(__buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_getName ] ---

	/** Unsafe version of {@link #class_getName} */
	@JavadocExclude
	public static long nclass_getName(long cls) {
		long __functionAddress = getInstance().class_getName;
		return invokePP(__functionAddress, cls);
	}

	/**
	 * Returns the name of a class.
	 *
	 * @param cls a class object
	 *
	 * @return the name of the class, or the empty string if cls is Nil
	 */
	public static String class_getName(long cls) {
		long __result = nclass_getName(cls);
		return memDecodeUTF8(__result);
	}

	// --- [ class_isMetaClass ] ---

	/**
	 * Returns a Boolean value that indicates whether a class object is a metaclass.
	 *
	 * @param cls a class object
	 *
	 * @return {@link #YES} if cls is a metaclass, {@link #NO} if cls is a non-meta class, {@link #NO} if cls is Nil
	 */
	public static byte class_isMetaClass(long cls) {
		long __functionAddress = getInstance().class_isMetaClass;
		return invokePB(__functionAddress, cls);
	}

	// --- [ class_getSuperclass ] ---

	/**
	 * Returns the superclass of a class.
	 *
	 * @param cls a class object
	 *
	 * @return the superclass of the class, or Nil if cls is a root class, or Nil if cls is Nil
	 */
	public static long class_getSuperclass(long cls) {
		long __functionAddress = getInstance().class_getSuperclass;
		return invokePP(__functionAddress, cls);
	}

	// --- [ class_getVersion ] ---

	/**
	 * Returns the version number of a class definition.
	 * 
	 * <p>You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
	 * especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
	 * layout of the instance variables in different class-definition versions.</p>
	 * 
	 * <p>Classes derived from the Foundation framework NSObject class can obtain the class-definition version number using the getVersion class method, which is
	 * implemented using the class_getVersion function.</p>
	 *
	 * @param cls a pointer to an Class data structure. Pass the class definition for which you wish to obtain the version
	 *
	 * @return an integer indicating the version number of the class definition
	 */
	public static int class_getVersion(long cls) {
		long __functionAddress = getInstance().class_getVersion;
		if ( CHECKS )
			checkPointer(cls);
		return invokePI(__functionAddress, cls);
	}

	// --- [ class_setVersion ] ---

	/**
	 * Sets the version number of a class definition.
	 * 
	 * <p>You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
	 * especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
	 * layout of the instance variables in different class-definition versions.</p>
	 * 
	 * <p>Classes derived from the Foundation framework NSObject class can set the class-definition version number using the setVersion: class method, which is
	 * implemented using the class_setVersion function.</p>
	 *
	 * @param cls     a pointer to an Class data structure. Pass the class definition for which you wish to set the version
	 * @param version the new version number of the class definition
	 */
	public static void class_setVersion(long cls, int version) {
		long __functionAddress = getInstance().class_setVersion;
		if ( CHECKS )
			checkPointer(cls);
		invokePIV(__functionAddress, cls, version);
	}

	// --- [ class_getInstanceSize ] ---

	/**
	 * Returns the size of instances of a class.
	 *
	 * @param cls a class object
	 *
	 * @return the size in bytes of instances of the class {@code cls}, or 0 if {@code cls} is Nil
	 */
	public static long class_getInstanceSize(long cls) {
		long __functionAddress = getInstance().class_getInstanceSize;
		return invokePP(__functionAddress, cls);
	}

	// --- [ class_getInstanceVariable ] ---

	/** Unsafe version of {@link #class_getInstanceVariable} */
	@JavadocExclude
	public static long nclass_getInstanceVariable(long cls, long name) {
		long __functionAddress = getInstance().class_getInstanceVariable;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPP(__functionAddress, cls, name);
	}

	/**
	 * Returns the Ivar for a specified instance variable of a given class.
	 *
	 * @param cls  the class whose instance variable you wish to obtain
	 * @param name the name of the instance variable definition to obtain
	 *
	 * @return a pointer to an Ivar data structure containing information about the instance variable specified by name
	 */
	public static long class_getInstanceVariable(long cls, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nclass_getInstanceVariable(cls, memAddress(name));
	}

	/** CharSequence version of: {@link #class_getInstanceVariable} */
	public static long class_getInstanceVariable(long cls, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_getInstanceVariable(cls, __buffer.address(nameEncoded));
	}

	// --- [ class_getClassVariable ] ---

	/** Unsafe version of {@link #class_getClassVariable} */
	@JavadocExclude
	public static long nclass_getClassVariable(long cls, long name) {
		long __functionAddress = getInstance().class_getClassVariable;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPP(__functionAddress, cls, name);
	}

	/**
	 * Returns the Ivar for a specified class variable of a given class.
	 *
	 * @param cls  the class definition whose class variable you wish to obtain
	 * @param name the name of the class variable definition to obtain
	 *
	 * @return a pointer to an Ivar data structure containing information about the class variable specified by name
	 */
	public static long class_getClassVariable(long cls, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nclass_getClassVariable(cls, memAddress(name));
	}

	/** CharSequence version of: {@link #class_getClassVariable} */
	public static long class_getClassVariable(long cls, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_getClassVariable(cls, __buffer.address(nameEncoded));
	}

	// --- [ class_copyIvarList ] ---

	/** Unsafe version of {@link #class_copyIvarList} */
	@JavadocExclude
	public static long nclass_copyIvarList(long cls, long outCount) {
		long __functionAddress = getInstance().class_copyIvarList;
		return invokePPP(__functionAddress, cls, outCount);
	}

	/**
	 * Describes the instance variables declared by a class.
	 *
	 * @param cls the class to inspect
	 *
	 * @return an array of pointers of type Ivar describing the instance variables declared by the class. Any instance variables declared by superclasses are not
	 *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
	 *         
	 *         <p>If the class declares no instance variables, or {@code cls} is Nil, {@code NULL} is returned and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer class_copyIvarList(long cls) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nclass_copyIvarList(cls, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_getInstanceMethod ] ---

	/**
	 * Returns a specified instance method for a given class.
	 * 
	 * <p>Note that this function searches superclasses for implementations, whereas {@link #class_copyMethodList} does not.</p>
	 *
	 * @param cls  the class you want to inspect
	 * @param name the selector of the method you want to retrieve
	 *
	 * @return the method that corresponds to the implementation of the selector specified by aSelector for the class specified by {@code cls}, or {@code NULL} if the
	 *         specified class or its superclasses do not contain an instance method with the specified selector.
	 */
	public static long class_getInstanceMethod(long cls, long name) {
		long __functionAddress = getInstance().class_getInstanceMethod;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return invokePPP(__functionAddress, cls, name);
	}

	// --- [ class_getClassMethod ] ---

	/**
	 * Returns a pointer to the data structure describing a given class method for a given class.
	 * 
	 * <p>Note that this function searches superclasses for implementations, whereas {@link #class_copyMethodList} does not.</p>
	 *
	 * @param cls  a pointer to a class definition. Pass the class that contains the method you want to retrieve
	 * @param name a pointer of type SEL. Pass the selector of the method you want to retrieve
	 *
	 * @return a pointer to the Method data structure that corresponds to the implementation of the selector specified by {@code name} for the class specified by
	 *         {@code cls}, or {@code NULL} if the specified class or its superclasses do not contain a class method with the specified selector.
	 */
	public static long class_getClassMethod(long cls, long name) {
		long __functionAddress = getInstance().class_getClassMethod;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return invokePPP(__functionAddress, cls, name);
	}

	// --- [ class_getMethodImplementation ] ---

	/**
	 * Returns the function pointer that would be called if a particular message were sent to an instance of a class.
	 * 
	 * <p>class_getMethodImplementation may be faster than <code style="font-family: monospace">method_getImplementation(class_getInstanceMethod(cls, name))</code>.</p>
	 * 
	 * <p>The function pointer returned may be a function internal to the runtime instead of an actual method implementation. For example, if instances of the
	 * class do not respond to the selector, the function pointer returned will be part of the runtime's message forwarding machinery.</p>
	 *
	 * @param cls  the class you want to inspect
	 * @param name a selector
	 *
	 * @return the function pointer that would be called if <code style="font-family: monospace">[object name]</code> were called with an instance of the class, or {@code NULL} if {@code cls} is Nil
	 */
	public static long class_getMethodImplementation(long cls, long name) {
		long __functionAddress = getInstance().class_getMethodImplementation;
		if ( CHECKS )
			checkPointer(name);
		return invokePPP(__functionAddress, cls, name);
	}

	// --- [ class_respondsToSelector ] ---

	/**
	 * Returns a Boolean value that indicates whether instances of a class respond to a particular selector.
	 * 
	 * <p>You should usually use NSObject's respondsToSelector: or instancesRespondToSelector: methods instead of this function.</p>
	 *
	 * @param cls  the class you want to inspect
	 * @param name a selector
	 *
	 * @return {@link #YES} if instances of the class respond to the selector, otherwise {@link #NO}
	 */
	public static byte class_respondsToSelector(long cls, long name) {
		long __functionAddress = getInstance().class_respondsToSelector;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return invokePPB(__functionAddress, cls, name);
	}

	// --- [ class_copyMethodList ] ---

	/** Unsafe version of {@link #class_copyMethodList} */
	@JavadocExclude
	public static long nclass_copyMethodList(long cls, long outCount) {
		long __functionAddress = getInstance().class_copyMethodList;
		return invokePPP(__functionAddress, cls, outCount);
	}

	/**
	 * Describes the instance methods implemented by a class.
	 *
	 * @param cls the class you want to inspect
	 *
	 * @return an array of pointers of type Method describing the instance methods implemented by the class—any instance methods implemented by superclasses are not
	 *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
	 *         
	 *         <p>If {@code cls} implements no instance methods, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer class_copyMethodList(long cls) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nclass_copyMethodList(cls, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_conformsToProtocol ] ---

	/**
	 * Returns a Boolean value that indicates whether a class conforms to a given protocol.
	 * 
	 * <p>You should usually use NSObject's conformsToProtocol: method instead of this function.</p>
	 *
	 * @param cls      the class you want to inspect
	 * @param protocol a protocol
	 *
	 * @return {@link #YES} if {@code cls} conforms to {@code protocol}, otherwise {@link #NO}
	 */
	public static byte class_conformsToProtocol(long cls, long protocol) {
		long __functionAddress = getInstance().class_conformsToProtocol;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(protocol);
		}
		return invokePPB(__functionAddress, cls, protocol);
	}

	// --- [ class_copyProtocolList ] ---

	/** Unsafe version of {@link #class_copyProtocolList} */
	@JavadocExclude
	public static long nclass_copyProtocolList(long cls, long outCount) {
		long __functionAddress = getInstance().class_copyProtocolList;
		return invokePPP(__functionAddress, cls, outCount);
	}

	/**
	 * Describes the protocols adopted by a class.
	 *
	 * @param cls the class you want to inspect
	 *
	 * @return an array of pointers of type Protocol* describing the protocols adopted by the class. Any protocols adopted by superclasses or other protocols are not
	 *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
	 *         
	 *         <p>If {@code cls} adopts no protocols, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer class_copyProtocolList(long cls) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nclass_copyProtocolList(cls, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_getProperty ] ---

	/** Unsafe version of {@link #class_getProperty} */
	@JavadocExclude
	public static long nclass_getProperty(long cls, long name) {
		long __functionAddress = getInstance().class_getProperty;
		return invokePPP(__functionAddress, cls, name);
	}

	/**
	 * Returns a property with a given name of a given class.
	 *
	 * @param cls  the class you want to inspect
	 * @param name a C string. Pass the name of the instance variable whose value you wish to modify.
	 *
	 * @return a pointer of type {@code objc_property_t} describing the property, or {@code NULL} if the class does not declare a property with that name, or {@code NULL} if
	 *         {@code cls} is Nil.
	 */
	public static long class_getProperty(long cls, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nclass_getProperty(cls, memAddress(name));
	}

	/** CharSequence version of: {@link #class_getProperty} */
	public static long class_getProperty(long cls, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_getProperty(cls, __buffer.address(nameEncoded));
	}

	// --- [ class_copyPropertyList ] ---

	/** Unsafe version of {@link #class_copyPropertyList} */
	@JavadocExclude
	public static long nclass_copyPropertyList(long cls, long outCount) {
		long __functionAddress = getInstance().class_copyPropertyList;
		return invokePPP(__functionAddress, cls, outCount);
	}

	/**
	 * Describes the properties declared by a class.
	 *
	 * @param cls the class you want to inspect
	 *
	 * @return an array of pointers of type {@code objc_property_t} describing the properties declared by the class. Any properties declared by superclasses are not
	 *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
	 *         
	 *         <p>If {@code cls} declares no properties, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer class_copyPropertyList(long cls) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nclass_copyPropertyList(cls, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_getIvarLayout ] ---

	/** Unsafe version of {@link #class_getIvarLayout} */
	@JavadocExclude
	public static long nclass_getIvarLayout(long cls) {
		long __functionAddress = getInstance().class_getIvarLayout;
		if ( CHECKS )
			checkPointer(cls);
		return invokePP(__functionAddress, cls);
	}

	/**
	 * Returns a description of the Ivar layout for a given class.
	 *
	 * @param cls the class to inspect
	 *
	 * @return a description of the Ivar layout for {@code cls}
	 */
	public static String class_getIvarLayout(long cls) {
		long __result = nclass_getIvarLayout(cls);
		return memDecodeASCII(__result);
	}

	// --- [ class_getWeakIvarLayout ] ---

	/** Unsafe version of {@link #class_getWeakIvarLayout} */
	@JavadocExclude
	public static long nclass_getWeakIvarLayout(long cls) {
		long __functionAddress = getInstance().class_getWeakIvarLayout;
		if ( CHECKS )
			checkPointer(cls);
		return invokePP(__functionAddress, cls);
	}

	/**
	 * Returns a description of the layout of weak Ivars for a given class.
	 *
	 * @param cls the class to inspect
	 *
	 * @return a description of the layout of the weak Ivars for {@code cls}
	 */
	public static String class_getWeakIvarLayout(long cls) {
		long __result = nclass_getWeakIvarLayout(cls);
		return memDecodeASCII(__result);
	}

	// --- [ class_addMethod ] ---

	/** Unsafe version of {@link #class_addMethod} */
	@JavadocExclude
	public static byte nclass_addMethod(long cls, long name, long imp, long types) {
		long __functionAddress = getInstance().class_addMethod;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
		}
		return invokePPPPB(__functionAddress, cls, name, imp, types);
	}

	/**
	 * Adds a new method to a class with a given name and implementation.
	 * 
	 * <h3>Discussion</h3>
	 * class_addMethod will add an override of a superclass's implementation, but will not replace an existing implementation in this class. To change an
	 * existing implementation, use {@link #method_setImplementation}.
	 * 
	 * <p>An Objective-C method is simply a C function that takes at least two arguments &ndash; {@code self} and {@code _cmd}. For example, given the following
	 * function:
	 * <pre><code style="font-family: monospace">
	 * void myMethodIMP(id self, SEL _cmd)
	 * {
	 * 	// implementation ....
	 * }</code></pre>
	 * you can dynamically add it to a class as a method (called {@code resolveThisMethodDynamically}) like this:
	 * <pre><code style="font-family: monospace">
	 * class_addMethod([self class], @selector(resolveThisMethodDynamically), (IMP) myMethodIMP, "v@:");</code></pre></p>
	 *
	 * @param cls   the class to which to add a method
	 * @param name  a selector that specifies the name of the method being added
	 * @param imp   a function which is the implementation of the new method. The function must take at least two arguments &ndash; {@code self} and {@code _cmd}.
	 * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming Guide
	 *              &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self} and
	 *              {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
	 *
	 * @return {@link #YES} if the method was added successfully, otherwise {@link #NO} (for example, the class already contains a method implementation with that name)
	 */
	public static byte class_addMethod(long cls, long name, long imp, ByteBuffer types) {
		if ( CHECKS )
			checkNT1(types);
		return nclass_addMethod(cls, name, imp, memAddress(types));
	}

	/** CharSequence version of: {@link #class_addMethod} */
	public static byte class_addMethod(long cls, long name, long imp, CharSequence types) {
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_addMethod(cls, name, imp, __buffer.address(typesEncoded));
	}

	// --- [ class_replaceMethod ] ---

	/** Unsafe version of {@link #class_replaceMethod} */
	@JavadocExclude
	public static long nclass_replaceMethod(long cls, long name, long imp, long types) {
		long __functionAddress = getInstance().class_replaceMethod;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
		}
		return invokePPPPP(__functionAddress, cls, name, imp, types);
	}

	/**
	 * Replaces the implementation of a method for a given class.
	 * 
	 * <h3>Discussion</h3>
	 * This function behaves in two different ways:
	 * <ul>
	 * <li>If the method identified by name does not yet exist, it is added as if class_addMethod were called. The type encoding specified by types is used as
	 * given.</li>
	 * <li>If the method identified by name does exist, its IMP is replaced as if method_setImplementation were called. The type encoding specified by types
	 * is ignored.</li>
	 * </ul>
	 *
	 * @param cls   the class you want to modify
	 * @param name  a selector that identifies the method whose implementation you want to replace
	 * @param imp   the new implementation for the method identified by {@code name} for the class identified by {@code cls}
	 * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming Guide
	 *              &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self} and
	 *              {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
	 *
	 * @return the previous implementation of the method identified by {@code name} for the class identified by {@code cls}
	 */
	public static long class_replaceMethod(long cls, long name, long imp, ByteBuffer types) {
		if ( CHECKS )
			checkNT1(types);
		return nclass_replaceMethod(cls, name, imp, memAddress(types));
	}

	/** CharSequence version of: {@link #class_replaceMethod} */
	public static long class_replaceMethod(long cls, long name, long imp, CharSequence types) {
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_replaceMethod(cls, name, imp, __buffer.address(typesEncoded));
	}

	// --- [ class_addIvar ] ---

	/** Unsafe version of {@link #class_addIvar} */
	@JavadocExclude
	public static byte nclass_addIvar(long cls, long name, long size, byte alignment, long types) {
		long __functionAddress = getInstance().class_addIvar;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPPBPB(__functionAddress, cls, name, size, alignment, types);
	}

	/**
	 * Adds a new instance variable to a class.
	 * 
	 * <p>This function may only be called after {@link #objc_allocateClassPair} and before {@link #objc_registerClassPair}. Adding an instance variable to an existing class
	 * is not supported.</p>
	 * 
	 * <p>The class must not be a metaclass. Adding an instance variable to a metaclass is not supported.</p>
	 * 
	 * <p>The instance variable's minimum alignment in bytes is <code style="font-family: monospace">1<<align</code>. The minimum alignment of an instance variable depends on the ivar's type and
	 * the machine architecture. For variables of any pointer type, pass <code style="font-family: monospace">log2(sizeof(pointer_type))</code>.</p>
	 *
	 * @param cls       
	 * @param name      
	 * @param size      
	 * @param alignment 
	 * @param types     
	 *
	 * @return {@link #YES} if the instance variable was added successfully, otherwise {@link #NO} (for example, the class already contains an instance variable with that name)
	 */
	public static byte class_addIvar(long cls, ByteBuffer name, long size, byte alignment, ByteBuffer types) {
		if ( CHECKS ) {
			checkNT1(name);
			checkNT1(types);
		}
		return nclass_addIvar(cls, memAddress(name), size, alignment, memAddress(types));
	}

	/** CharSequence version of: {@link #class_addIvar} */
	public static byte class_addIvar(long cls, CharSequence name, long size, byte alignment, CharSequence types) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_addIvar(cls, __buffer.address(nameEncoded), size, alignment, __buffer.address(typesEncoded));
	}

	// --- [ class_addProtocol ] ---

	/**
	 * Adds a protocol to a class.
	 *
	 * @param cls      the class to modify
	 * @param protocol the protocol to add to {@code cls}
	 *
	 * @return {@link #YES} if the protocol was added successfully, otherwise {@link #NO} (for example, the class already conforms to that protocol)
	 */
	public static byte class_addProtocol(long cls, long protocol) {
		long __functionAddress = getInstance().class_addProtocol;
		if ( CHECKS ) {
			checkPointer(cls);
			checkPointer(protocol);
		}
		return invokePPB(__functionAddress, cls, protocol);
	}

	// --- [ class_addProperty ] ---

	/** Unsafe version of {@link #class_addProperty} */
	@JavadocExclude
	public static byte nclass_addProperty(long cls, long name, long attributes, int attributeCount) {
		long __functionAddress = getInstance().class_addProperty;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPPIB(__functionAddress, cls, name, attributes, attributeCount);
	}

	/**
	 * Adds a property to a class.
	 *
	 * @param cls            the class to modify
	 * @param name           the name of the property
	 * @param attributes     an array of property attributes
	 * @param attributeCount the number of attributes in {@code attributes}
	 *
	 * @return {@link #YES} if the property was added successfully; otherwise {@link #NO} (for example, this function returns {@link #NO} if the class already has that property)
	 */
	public static byte class_addProperty(long cls, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes, int attributeCount) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(attributes, attributeCount);
		}
		return nclass_addProperty(cls, memAddress(name), attributes.address(), attributeCount);
	}

	/** Alternative version of: {@link #class_addProperty} */
	public static byte class_addProperty(long cls, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes) {
		return nclass_addProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
	}

	/** CharSequence version of: {@link #class_addProperty} */
	public static byte class_addProperty(long cls, CharSequence name, ObjCPropertyAttribute.Buffer attributes) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_addProperty(cls, __buffer.address(nameEncoded), attributes.address(), attributes.remaining());
	}

	// --- [ class_replaceProperty ] ---

	/** Unsafe version of {@link #class_replaceProperty} */
	@JavadocExclude
	public static void nclass_replaceProperty(long cls, long name, long attributes, int attributeCount) {
		long __functionAddress = getInstance().class_replaceProperty;
		if ( CHECKS )
			checkPointer(cls);
		invokePPPIV(__functionAddress, cls, name, attributes, attributeCount);
	}

	/**
	 * Replaces a property of a class.
	 *
	 * @param cls            the class to modify
	 * @param name           the name of the property
	 * @param attributes     an array of property attributes
	 * @param attributeCount the number of attributes in {@code attributes}
	 */
	public static void class_replaceProperty(long cls, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes, int attributeCount) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(attributes, attributeCount);
		}
		nclass_replaceProperty(cls, memAddress(name), attributes.address(), attributeCount);
	}

	/** Alternative version of: {@link #class_replaceProperty} */
	public static void class_replaceProperty(long cls, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes) {
		nclass_replaceProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
	}

	/** CharSequence version of: {@link #class_replaceProperty} */
	public static void class_replaceProperty(long cls, CharSequence name, ObjCPropertyAttribute.Buffer attributes) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		nclass_replaceProperty(cls, __buffer.address(nameEncoded), attributes.address(), attributes.remaining());
	}

	// --- [ class_setIvarLayout ] ---

	/** Unsafe version of {@link #class_setIvarLayout} */
	@JavadocExclude
	public static void nclass_setIvarLayout(long cls, long layout) {
		long __functionAddress = getInstance().class_setIvarLayout;
		if ( CHECKS )
			checkPointer(cls);
		invokePPV(__functionAddress, cls, layout);
	}

	/**
	 * Sets the Ivar layout for a given class.
	 *
	 * @param cls    the class to modify
	 * @param layout the layout of the Ivars for {@code cls}
	 */
	public static void class_setIvarLayout(long cls, ByteBuffer layout) {
		if ( CHECKS )
			checkNT1(layout);
		nclass_setIvarLayout(cls, memAddress(layout));
	}

	/** CharSequence version of: {@link #class_setIvarLayout} */
	public static void class_setIvarLayout(long cls, CharSequence layout) {
		APIBuffer __buffer = apiBuffer();
		int layoutEncoded = __buffer.stringParamASCII(layout, true);
		nclass_setIvarLayout(cls, __buffer.address(layoutEncoded));
	}

	// --- [ class_setWeakIvarLayout ] ---

	/** Unsafe version of {@link #class_setWeakIvarLayout} */
	@JavadocExclude
	public static void nclass_setWeakIvarLayout(long cls, long layout) {
		long __functionAddress = getInstance().class_setWeakIvarLayout;
		if ( CHECKS )
			checkPointer(cls);
		invokePPV(__functionAddress, cls, layout);
	}

	/**
	 * Sets the layout for weak Ivars for a given class.
	 *
	 * @param cls    the class to modify
	 * @param layout the layout of the weak Ivars for {@code cls}
	 */
	public static void class_setWeakIvarLayout(long cls, ByteBuffer layout) {
		if ( CHECKS )
			checkNT1(layout);
		nclass_setWeakIvarLayout(cls, memAddress(layout));
	}

	/** CharSequence version of: {@link #class_setWeakIvarLayout} */
	public static void class_setWeakIvarLayout(long cls, CharSequence layout) {
		APIBuffer __buffer = apiBuffer();
		int layoutEncoded = __buffer.stringParamASCII(layout, true);
		nclass_setWeakIvarLayout(cls, __buffer.address(layoutEncoded));
	}

	// --- [ class_createInstance ] ---

	/**
	 * Creates an instance of a class, allocating memory for the class in the default malloc memory zone.
	 *
	 * @param cls        the class that you want to allocate an instance of
	 * @param extraBytes an integer indicating the number of extra bytes to allocate. The additional bytes can be used to store additional instance variables beyond those
	 *                   defined in the class definition.
	 *
	 * @return an instance of the class {@code cls}
	 */
	public static long class_createInstance(long cls, long extraBytes) {
		long __functionAddress = getInstance().class_createInstance;
		if ( CHECKS )
			checkPointer(cls);
		return invokePPP(__functionAddress, cls, extraBytes);
	}

	// --- [ objc_constructInstance ] ---

	/** Unsafe version of {@link #objc_constructInstance} */
	@JavadocExclude
	public static long nobjc_constructInstance(long cls, long bytes) {
		long __functionAddress = getInstance().objc_constructInstance;
		return invokePPP(__functionAddress, cls, bytes);
	}

	/**
	 * Creates an instance of a class at the specified location.
	 *
	 * @param cls   the class that you want to allocate an instance of
	 * @param bytes the location at which to allocate an instance of the {@code cls} class. {@code bytes} must point to at least <code style="font-family: monospace">class_getInstanceSize(cls)</code>
	 *              bytes of well-aligned, zero-filled memory.
	 *
	 * @return an instance of the class {@code cls} at {@code bytes}, if successful; otherwise {@link #nil} (for example, if {@code cls} or {@code bytes} are themselves {@link #nil})
	 */
	public static long objc_constructInstance(long cls, ByteBuffer bytes) {
		return nobjc_constructInstance(cls, memAddressSafe(bytes));
	}

	// --- [ objc_destructInstance ] ---

	/**
	 * Destroys an instance of a class without freeing memory and removes any of its associated references.
	 * 
	 * <p>This method does nothing if obj is {@link #nil}.</p>
	 * 
	 * <h3>Important</h3>
	 * The garbage collector does not call this function. As a result, if you edit this function, you should also edit finalize. That said, Core Foundation
	 * and other clients do call this function under garbage collection.
	 *
	 * @param obj the instance to destroy
	 */
	public static long objc_destructInstance(long obj) {
		long __functionAddress = getInstance().objc_destructInstance;
		if ( CHECKS )
			checkPointer(obj);
		return invokePP(__functionAddress, obj);
	}

	// --- [ objc_allocateClassPair ] ---

	/** Unsafe version of {@link #objc_allocateClassPair} */
	@JavadocExclude
	public static long nobjc_allocateClassPair(long superclass, long name, long extraBytes) {
		long __functionAddress = getInstance().objc_allocateClassPair;
		return invokePPPP(__functionAddress, superclass, name, extraBytes);
	}

	/**
	 * Creates a new class and metaclass.
	 * 
	 * <p>You can get a pointer to the new metaclass by calling <code style="font-family: monospace">object_getClass(newClass)</code>.</p>
	 * 
	 * <p>To create a new class, start by calling objc_allocateClassPair. Then set the class's attributes with functions like {@link #class_addMethod} and
	 * {@link #class_addIvar}. When you are done building the class, call {@link #objc_registerClassPair}. The new class is now ready for use.</p>
	 * 
	 * <p>Instance methods and instance variables should be added to the class itself. Class methods should be added to the metaclass.</p>
	 *
	 * @param superclass the class to use as the new class's superclass, or Nil to create a new root class
	 * @param name       the string to use as the new class's name. The string will be copied.
	 * @param extraBytes the number of bytes to allocate for indexed ivars at the end of the class and metaclass objects. This should usually be 0.
	 *
	 * @return the new class, or Nil if the class could not be created (for example, the desired name is already in use)
	 */
	public static long objc_allocateClassPair(long superclass, ByteBuffer name, long extraBytes) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_allocateClassPair(superclass, memAddress(name), extraBytes);
	}

	/** CharSequence version of: {@link #objc_allocateClassPair} */
	public static long objc_allocateClassPair(long superclass, CharSequence name, long extraBytes) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_allocateClassPair(superclass, __buffer.address(nameEncoded), extraBytes);
	}

	// --- [ objc_registerClassPair ] ---

	/**
	 * Registers a class that was allocated using {@link #objc_allocateClassPair}.
	 *
	 * @param cls the class you want to register
	 */
	public static void objc_registerClassPair(long cls) {
		long __functionAddress = getInstance().objc_registerClassPair;
		if ( CHECKS )
			checkPointer(cls);
		invokePV(__functionAddress, cls);
	}

	// --- [ objc_disposeClassPair ] ---

	/**
	 * Destroys a class and its associated metaclass.
	 * 
	 * <p>Do not call this function if instances of the {@code cls} class or any subclass exist.</p>
	 *
	 * @param cls the class to be destroyed. This class must have been allocated using {@link #objc_allocateClassPair}.
	 */
	public static void objc_disposeClassPair(long cls) {
		long __functionAddress = getInstance().objc_disposeClassPair;
		if ( CHECKS )
			checkPointer(cls);
		invokePV(__functionAddress, cls);
	}

	// --- [ method_getName ] ---

	/**
	 * Returns the name of a method.
	 * 
	 * <p>To get the method name as a C string, call <code style="font-family: monospace">sel_getName(method_getName(method))</code>.</p>
	 *
	 * @param m the method to inspect
	 *
	 * @return a pointer of type SEL
	 */
	public static long method_getName(long m) {
		long __functionAddress = getInstance().method_getName;
		if ( CHECKS )
			checkPointer(m);
		return invokePP(__functionAddress, m);
	}

	// --- [ method_getImplementation ] ---

	/**
	 * Returns the implementation of a method.
	 *
	 * @param m the method to inspect
	 *
	 * @return a function pointer of type IMP
	 */
	public static long method_getImplementation(long m) {
		long __functionAddress = getInstance().method_getImplementation;
		if ( CHECKS )
			checkPointer(m);
		return invokePP(__functionAddress, m);
	}

	// --- [ method_getTypeEncoding ] ---

	/** Unsafe version of {@link #method_getTypeEncoding} */
	@JavadocExclude
	public static long nmethod_getTypeEncoding(long m) {
		long __functionAddress = getInstance().method_getTypeEncoding;
		if ( CHECKS )
			checkPointer(m);
		return invokePP(__functionAddress, m);
	}

	/**
	 * Returns a string describing a method's parameter and return types.
	 *
	 * @param m the method to inspect
	 *
	 * @return a C string. The string may be {@code NULL}
	 */
	public static String method_getTypeEncoding(long m) {
		long __result = nmethod_getTypeEncoding(m);
		return memDecodeUTF8(__result);
	}

	// --- [ method_getNumberOfArguments ] ---

	/**
	 * Returns the number of arguments accepted by a method.
	 *
	 * @param m a pointer to a Method data structure. Pass the method in question.
	 *
	 * @return an integer containing the number of arguments accepted by the given method
	 */
	public static int method_getNumberOfArguments(long m) {
		long __functionAddress = getInstance().method_getNumberOfArguments;
		if ( CHECKS )
			checkPointer(m);
		return invokePI(__functionAddress, m);
	}

	// --- [ method_copyReturnType ] ---

	/** Unsafe version of {@link #method_copyReturnType} */
	@JavadocExclude
	public static long nmethod_copyReturnType(long m) {
		long __functionAddress = getInstance().method_copyReturnType;
		if ( CHECKS )
			checkPointer(m);
		return invokePP(__functionAddress, m);
	}

	/**
	 * Returns a string describing a method's return type.
	 *
	 * @param m the method to inspect
	 *
	 * @return a C string describing the return type. You must free the string with free().
	 */
	public static String method_copyReturnType(long m) {
		long __result = nmethod_copyReturnType(m);
		return memDecodeUTF8(__result);
	}

	// --- [ method_copyArgumentType ] ---

	/** Unsafe version of {@link #method_copyArgumentType} */
	@JavadocExclude
	public static long nmethod_copyArgumentType(long m, int index) {
		long __functionAddress = getInstance().method_copyArgumentType;
		if ( CHECKS )
			checkPointer(m);
		return invokePIP(__functionAddress, m, index);
	}

	/**
	 * Returns a string describing a single parameter type of a method.
	 *
	 * @param m     the method to inspect
	 * @param index the index of the parameter to inspect
	 *
	 * @return a C string describing the type of the parameter at index {@code index}, or {@code NULL} if method has no parameter index {@code index}. You must free the
	 *         string with free().
	 */
	public static String method_copyArgumentType(long m, int index) {
		long __result = nmethod_copyArgumentType(m, index);
		return memDecodeUTF8(__result);
	}

	// --- [ method_getReturnType ] ---

	/** Unsafe version of {@link #method_getReturnType} */
	@JavadocExclude
	public static void nmethod_getReturnType(long m, long dst, long dst_len) {
		long __functionAddress = getInstance().method_getReturnType;
		if ( CHECKS )
			checkPointer(m);
		invokePPPV(__functionAddress, m, dst, dst_len);
	}

	/**
	 * Returns by reference a string describing a method's return type.
	 * 
	 * <p>The method's return type string is copied to {@code dst}. {@code dst} is filled as if <code style="font-family: monospace">strncpy(dst, parameter_type, dst_len)</code> were called.</p>
	 *
	 * @param m       the method to inspect
	 * @param dst     the reference string to store the description
	 * @param dst_len the maximum number of characters that can be stored in {@code dst}
	 */
	public static void method_getReturnType(long m, ByteBuffer dst, long dst_len) {
		if ( CHECKS )
			checkBuffer(dst, dst_len);
		nmethod_getReturnType(m, memAddress(dst), dst_len);
	}

	/** Alternative version of: {@link #method_getReturnType} */
	public static void method_getReturnType(long m, ByteBuffer dst) {
		nmethod_getReturnType(m, memAddress(dst), dst.remaining());
	}

	/** String return version of: {@link #method_getReturnType} */
	public static String method_getReturnType(long m, long dst_len) {
		APIBuffer __buffer = apiBuffer();
		int dst = __buffer.bufferParam((int)dst_len);
		nmethod_getReturnType(m, __buffer.address(dst), dst_len);
		return memDecodeUTF8(memByteBufferNT1(__buffer.address(dst), (int)dst_len));
	}

	// --- [ method_getArgumentType ] ---

	/** Unsafe version of {@link #method_getArgumentType} */
	@JavadocExclude
	public static void nmethod_getArgumentType(long m, int index, long dst, long dst_len) {
		long __functionAddress = getInstance().method_getArgumentType;
		if ( CHECKS )
			checkPointer(m);
		invokePIPPV(__functionAddress, m, index, dst, dst_len);
	}

	/**
	 * Returns by reference a string describing a single parameter type of a method.
	 * 
	 * <p>The parameter type string is copied to {@code dst}. {@code dst} is filled as if <code style="font-family: monospace">strncpy(dst, parameter_type, dst_len)</code> were called. If the
	 * method contains no parameter with that index, {@code dst} is filled as if <code style="font-family: monospace">strncpy(dst, "", dst_len)</code> were called.</p>
	 *
	 * @param m       the method you want to inquire about
	 * @param index   the index of the parameter you want to inquire about
	 * @param dst     the reference string to store the description
	 * @param dst_len the maximum number of characters that can be stored in {@code dst}
	 */
	public static void method_getArgumentType(long m, int index, ByteBuffer dst, long dst_len) {
		if ( CHECKS )
			checkBuffer(dst, dst_len);
		nmethod_getArgumentType(m, index, memAddress(dst), dst_len);
	}

	/** Alternative version of: {@link #method_getArgumentType} */
	public static void method_getArgumentType(long m, int index, ByteBuffer dst) {
		nmethod_getArgumentType(m, index, memAddress(dst), dst.remaining());
	}

	/** String return version of: {@link #method_getArgumentType} */
	public static String method_getArgumentType(long m, int index, long dst_len) {
		APIBuffer __buffer = apiBuffer();
		int dst = __buffer.bufferParam((int)dst_len);
		nmethod_getArgumentType(m, index, __buffer.address(dst), dst_len);
		return memDecodeUTF8(memByteBufferNT1(__buffer.address(dst), (int)dst_len));
	}

	// --- [ method_setImplementation ] ---

	/**
	 * Sets the implementation of a method.
	 *
	 * @param m   the method for which to set an implementation
	 * @param imp the implemention to set to this method
	 *
	 * @return the previous implementation of the method
	 */
	public static long method_setImplementation(long m, long imp) {
		long __functionAddress = getInstance().method_setImplementation;
		if ( CHECKS ) {
			checkPointer(m);
			checkPointer(imp);
		}
		return invokePPP(__functionAddress, m, imp);
	}

	// --- [ method_exchangeImplementations ] ---

	/**
	 * Exchanges the implementations of two methods.
	 *
	 * @param m1 the method to exchange with second method
	 * @param m2 the method to exchange with first method
	 */
	public static void method_exchangeImplementations(long m1, long m2) {
		long __functionAddress = getInstance().method_exchangeImplementations;
		if ( CHECKS ) {
			checkPointer(m1);
			checkPointer(m2);
		}
		invokePPV(__functionAddress, m1, m2);
	}

	// --- [ ivar_getName ] ---

	/** Unsafe version of {@link #ivar_getName} */
	@JavadocExclude
	public static long nivar_getName(long v) {
		long __functionAddress = getInstance().ivar_getName;
		if ( CHECKS )
			checkPointer(v);
		return invokePP(__functionAddress, v);
	}

	/**
	 * Returns the name of an instance variable.
	 *
	 * @param v the instance variable
	 *
	 * @return a C string containing the instance variable's name
	 */
	public static String ivar_getName(long v) {
		long __result = nivar_getName(v);
		return memDecodeUTF8(__result);
	}

	// --- [ ivar_getTypeEncoding ] ---

	/** Unsafe version of {@link #ivar_getTypeEncoding} */
	@JavadocExclude
	public static long nivar_getTypeEncoding(long v) {
		long __functionAddress = getInstance().ivar_getTypeEncoding;
		if ( CHECKS )
			checkPointer(v);
		return invokePP(__functionAddress, v);
	}

	/**
	 * Returns the type string of an instance variable.
	 *
	 * @param v the instance variable
	 *
	 * @return a C string containing the instance variable's type encoding
	 */
	public static String ivar_getTypeEncoding(long v) {
		long __result = nivar_getTypeEncoding(v);
		return memDecodeUTF8(__result);
	}

	// --- [ ivar_getOffset ] ---

	/**
	 * Returns the offset of an instance variable.
	 * 
	 * <p>For instance variables of type {@code id} or other object types, call {@link #object_getIvar} and {@link #object_setIvar} instead of using this offset to access
	 * the instance variable data directly.</p>
	 *
	 * @param v the instance variable
	 *
	 * @return the offset of {@code v}
	 */
	public static long ivar_getOffset(long v) {
		long __functionAddress = getInstance().ivar_getOffset;
		if ( CHECKS )
			checkPointer(v);
		return invokePP(__functionAddress, v);
	}

	// --- [ property_getName ] ---

	/** Unsafe version of {@link #property_getName} */
	@JavadocExclude
	public static long nproperty_getName(long property) {
		long __functionAddress = getInstance().property_getName;
		if ( CHECKS )
			checkPointer(property);
		return invokePP(__functionAddress, property);
	}

	/**
	 * Returns the name of a property.
	 *
	 * @param property the property you want to inquire about
	 *
	 * @return a C string containing the property's name
	 */
	public static String property_getName(long property) {
		long __result = nproperty_getName(property);
		return memDecodeUTF8(__result);
	}

	// --- [ property_getAttributes ] ---

	/** Unsafe version of {@link #property_getAttributes} */
	@JavadocExclude
	public static long nproperty_getAttributes(long property) {
		long __functionAddress = getInstance().property_getAttributes;
		if ( CHECKS )
			checkPointer(property);
		return invokePP(__functionAddress, property);
	}

	/**
	 * Returns the attribute string of a property.
	 *
	 * @param property a property
	 *
	 * @return a C string containing the property's attributes
	 */
	public static String property_getAttributes(long property) {
		long __result = nproperty_getAttributes(property);
		return memDecodeUTF8(__result);
	}

	// --- [ property_copyAttributeList ] ---

	/** Unsafe version of {@link #property_copyAttributeList} */
	@JavadocExclude
	public static long nproperty_copyAttributeList(long property, long outCount) {
		long __functionAddress = getInstance().property_copyAttributeList;
		if ( CHECKS )
			checkPointer(property);
		return invokePPP(__functionAddress, property, outCount);
	}

	/**
	 * Returns an array of property attributes for a given property.
	 *
	 * @param property the property whose attributes you want to copy
	 * @param outCount the number of attributes returned in the array
	 *
	 * @return an array of property attributes. You must free the array with free().
	 */
	public static ObjCPropertyAttribute.Buffer property_copyAttributeList(long property) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nproperty_copyAttributeList(property, __buffer.address(outCount));
		return new ObjCPropertyAttribute.Buffer(memByteBuffer(__result, __buffer.intValue(outCount) * ObjCPropertyAttribute.SIZEOF));
	}

	// --- [ property_copyAttributeValue ] ---

	/** Unsafe version of {@link #property_copyAttributeValue} */
	@JavadocExclude
	public static long nproperty_copyAttributeValue(long property, long attributeName) {
		long __functionAddress = getInstance().property_copyAttributeValue;
		if ( CHECKS )
			checkPointer(property);
		return invokePPP(__functionAddress, property, attributeName);
	}

	/**
	 * Returns the value of a property attribute given the attribute name.
	 *
	 * @param property      the property whose value you are interested in
	 * @param attributeName a C string representing the name of the attribute
	 *
	 * @return The value string of the {@code attributeName} attribute, if one exists in {@code property}; otherwise, {@link #nil}. You must free the returned value string
	 *         with free().
	 */
	public static String property_copyAttributeValue(long property, ByteBuffer attributeName) {
		long __result = nproperty_copyAttributeValue(property, memAddress(attributeName));
		return memDecodeUTF8(__result);
	}

	/**
	 * Returns the value of a property attribute given the attribute name.
	 *
	 * @param property      the property whose value you are interested in
	 * @param attributeName a C string representing the name of the attribute
	 *
	 * @return The value string of the {@code attributeName} attribute, if one exists in {@code property}; otherwise, {@link #nil}. You must free the returned value string
	 *         with free().
	 */
	public static String property_copyAttributeValue(long property, CharSequence attributeName) {
		APIBuffer __buffer = apiBuffer();
		int attributeNameEncoded = __buffer.stringParamUTF8(attributeName, true);
		long __result = nproperty_copyAttributeValue(property, __buffer.address(attributeNameEncoded));
		return memDecodeUTF8(__result);
	}

	// --- [ objc_getProtocol ] ---

	/** Unsafe version of {@link #objc_getProtocol} */
	@JavadocExclude
	public static long nobjc_getProtocol(long name) {
		long __functionAddress = getInstance().objc_getProtocol;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Returns a specified protocol.
	 * 
	 * <p>This function acquires the runtime lock.</p>
	 *
	 * @param name the name of a protocol
	 *
	 * @return the protocol named {@code name}{, or {@code NULL} if no protocol named name could be found
	 */
	public static long objc_getProtocol(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_getProtocol(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_getProtocol} */
	public static long objc_getProtocol(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_getProtocol(__buffer.address(nameEncoded));
	}

	// --- [ objc_copyProtocolList ] ---

	/** Unsafe version of {@link #objc_copyProtocolList} */
	@JavadocExclude
	public static long nobjc_copyProtocolList(long outCount) {
		long __functionAddress = getInstance().objc_copyProtocolList;
		return invokePP(__functionAddress, outCount);
	}

	/**
	 * Returns an array of all the protocols known to the runtime.
	 *
	 * @return a C array of all the protocols known to the runtime. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the
	 *         list with free().
	 */
	public static PointerBuffer objc_copyProtocolList() {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nobjc_copyProtocolList(__buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ protocol_conformsToProtocol ] ---

	/**
	 * Returns a Boolean value that indicates whether one protocol conforms to another protocol.
	 * 
	 * <h3>Discussion</h3>
	 * One protocol can incorporate other protocols using the same syntax that classes use to adopt a protocol:
	 * 
	 * <p><code style="font-family: monospace">@protocol ProtocolName < protocol list ></code></p>
	 * 
	 * <p>All the protocols listed between angle brackets are considered part of the {@code ProtocolName} protocol.</p>
	 *
	 * @param proto a protocol
	 * @param other a protocol
	 *
	 * @return {@link #YES} if {@code proto} conforms to {@code other}, otherwise {@link #NO}
	 */
	public static byte protocol_conformsToProtocol(long proto, long other) {
		long __functionAddress = getInstance().protocol_conformsToProtocol;
		if ( CHECKS ) {
			checkPointer(proto);
			checkPointer(other);
		}
		return invokePPB(__functionAddress, proto, other);
	}

	// --- [ protocol_isEqual ] ---

	/**
	 * Returns a Boolean value that indicates whether two protocols are equal.
	 *
	 * @param proto a protocol
	 * @param other a protocol
	 *
	 * @return {@link #YES} if proto is the same as other, otherwise {@link #NO}
	 */
	public static byte protocol_isEqual(long proto, long other) {
		long __functionAddress = getInstance().protocol_isEqual;
		if ( CHECKS ) {
			checkPointer(proto);
			checkPointer(other);
		}
		return invokePPB(__functionAddress, proto, other);
	}

	// --- [ protocol_getName ] ---

	/** Unsafe version of {@link #protocol_getName} */
	@JavadocExclude
	public static long nprotocol_getName(long p) {
		long __functionAddress = getInstance().protocol_getName;
		if ( CHECKS )
			checkPointer(p);
		return invokePP(__functionAddress, p);
	}

	/**
	 * Returns a the name of a protocol.
	 *
	 * @param p a protocol
	 *
	 * @return the name of the protocol {@code p} as a C string
	 */
	public static String protocol_getName(long p) {
		long __result = nprotocol_getName(p);
		return memDecodeUTF8(__result);
	}

	// --- [ protocol_getMethodDescription ] ---

	/** JNI method for {@link #protocol_getMethodDescription} */
	@JavadocExclude
	public static native void nprotocol_getMethodDescription(long __functionAddress, long p, long aSel, byte isRequiredMethod, byte isInstanceMethod, long __result);

	/** Unsafe version of {@link #protocol_getMethodDescription} */
	@JavadocExclude
	public static void nprotocol_getMethodDescription(long p, long aSel, byte isRequiredMethod, byte isInstanceMethod, long __result) {
		long __functionAddress = getInstance().protocol_getMethodDescription;
		if ( CHECKS ) {
			checkPointer(p);
			checkPointer(aSel);
		}
		nprotocol_getMethodDescription(__functionAddress, p, aSel, isRequiredMethod, isInstanceMethod, __result);
	}

	/**
	 * Returns a method description structure for a specified method of a given protocol.
	 *
	 * @param p                a protocol
	 * @param aSel             a selector
	 * @param isRequiredMethod a Boolean value that indicates whether {@code aSel} is a required method
	 * @param isInstanceMethod a Boolean value that indicates whether {@code aSel} is a instance method
	 * @param __result         an objc_method_description structure that describes the method specified by {@code aSel}, {@code isRequiredMethod}, and {@code isInstanceMethod} for
	 *                         the protocol {@code p}.
	 *                         
	 *                         <p>If the protocol does not contain the specified method, returns an objc_method_description structure with the value <code style="font-family: monospace">{NULL, NULL}</code>.</p>
	 */
	public static void protocol_getMethodDescription(long p, long aSel, byte isRequiredMethod, byte isInstanceMethod, ObjCMethodDescription __result) {
		nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __result.address());
	}

	// --- [ protocol_copyMethodDescriptionList ] ---

	/** Unsafe version of {@link #protocol_copyMethodDescriptionList} */
	@JavadocExclude
	public static long nprotocol_copyMethodDescriptionList(long p, byte isRequiredMethod, byte isInstanceMethod, long outCount) {
		long __functionAddress = getInstance().protocol_copyMethodDescriptionList;
		if ( CHECKS )
			checkPointer(p);
		return invokePBBPP(__functionAddress, p, isRequiredMethod, isInstanceMethod, outCount);
	}

	/**
	 * Returns an array of method descriptions of methods meeting a given specification for a given protocol.
	 * 
	 * <p>Methods in other protocols adopted by this protocol are not included.</p>
	 *
	 * @param p                a protocol
	 * @param isRequiredMethod a Boolean value that indicates whether returned methods should be required methods (pass {@link #YES} to specify required methods)
	 * @param isInstanceMethod a Boolean value that indicates whether returned methods should be instance methods (pass {@link #YES} to specify instance methods)
	 * @param outCount         upon return, contains the number of method description structures in the returned array
	 *
	 * @return a C array of objc_method_description structures containing the names and types of {@code p}'s methods specified by {@code isRequiredMethod} and
	 *         {@code isInstanceMethod}. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the list with free().
	 *         
	 *         <p>If the protocol declares no methods that meet the specification, {@code NULL} is returned and {@code *outCount} is 0.</p>
	 */
	public static ObjCMethodDescription.Buffer protocol_copyMethodDescriptionList(long p, byte isRequiredMethod, byte isInstanceMethod) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nprotocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, __buffer.address(outCount));
		return new ObjCMethodDescription.Buffer(memByteBuffer(__result, __buffer.intValue(outCount) * ObjCMethodDescription.SIZEOF));
	}

	// --- [ protocol_getProperty ] ---

	/** Unsafe version of {@link #protocol_getProperty} */
	@JavadocExclude
	public static long nprotocol_getProperty(long proto, long name, byte isRequiredProperty, byte isInstanceProperty) {
		long __functionAddress = getInstance().protocol_getProperty;
		if ( CHECKS )
			checkPointer(proto);
		return invokePPBBP(__functionAddress, proto, name, isRequiredProperty, isInstanceProperty);
	}

	/**
	 * Returns the specified property of a given protocol.
	 *
	 * @param proto              a protocol
	 * @param name               the name of a property
	 * @param isRequiredProperty a Boolean value that indicates whether {@code name} is a required property
	 * @param isInstanceProperty a Boolean value that indicates whether {@code name} is a instance property
	 *
	 * @return the property specified by {@code name}, {@code isRequiredProperty}, and {@code isInstanceProperty} for {@code proto}, or {@code NULL} if none of
	 *         {@code proto}'s properties meets the specification
	 */
	public static long protocol_getProperty(long proto, ByteBuffer name, byte isRequiredProperty, byte isInstanceProperty) {
		if ( CHECKS )
			checkNT1(name);
		return nprotocol_getProperty(proto, memAddress(name), isRequiredProperty, isInstanceProperty);
	}

	/** CharSequence version of: {@link #protocol_getProperty} */
	public static long protocol_getProperty(long proto, CharSequence name, byte isRequiredProperty, byte isInstanceProperty) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nprotocol_getProperty(proto, __buffer.address(nameEncoded), isRequiredProperty, isInstanceProperty);
	}

	// --- [ protocol_copyPropertyList ] ---

	/** Unsafe version of {@link #protocol_copyPropertyList} */
	@JavadocExclude
	public static long nprotocol_copyPropertyList(long proto, long outCount) {
		long __functionAddress = getInstance().protocol_copyPropertyList;
		if ( CHECKS )
			checkPointer(proto);
		return invokePPP(__functionAddress, proto, outCount);
	}

	/**
	 * Returns an array of the properties declared by a protocol.
	 *
	 * @param proto a protocol
	 *
	 * @return a C array of pointers of type objc_property_t describing the properties declared by {@code proto}. Any properties declared by other protocols adopted
	 *         by this protocol are not included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
	 *         
	 *         <p>If the protocol declares no properties, {@code NULL} is returned and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer protocol_copyPropertyList(long proto) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nprotocol_copyPropertyList(proto, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ protocol_copyProtocolList ] ---

	/** Unsafe version of {@link #protocol_copyProtocolList} */
	@JavadocExclude
	public static long nprotocol_copyProtocolList(long proto, long outCount) {
		long __functionAddress = getInstance().protocol_copyProtocolList;
		if ( CHECKS )
			checkPointer(proto);
		return invokePPP(__functionAddress, proto, outCount);
	}

	/**
	 * eturns an array of the protocols adopted by a protocol.
	 *
	 * @param proto a protocol
	 *
	 * @return a C array of protocols adopted by {@code proto}. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array
	 *         with free().
	 *         
	 *         <p>If the protocol declares no properties, {@code NULL} is returned and {@code *outCount} is 0.</p>
	 */
	public static PointerBuffer protocol_copyProtocolList(long proto) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nprotocol_copyProtocolList(proto, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ objc_allocateProtocol ] ---

	/** Unsafe version of {@link #objc_allocateProtocol} */
	@JavadocExclude
	public static long nobjc_allocateProtocol(long name) {
		long __functionAddress = getInstance().objc_allocateProtocol;
		return invokePP(__functionAddress, name);
	}

	/**
	 * Creates a new protocol instance.
	 * 
	 * <p>You must register the returned protocol instance with the {@link #objc_registerProtocol} function before you can use it.</p>
	 * 
	 * <p>There is no dispose method associated with this function.</p>
	 *
	 * @param name the name of the protocol you want to create
	 *
	 * @return a new protocol instance or {@link #nil} if a protocol with the same name as {@code name} already exists
	 */
	public static long objc_allocateProtocol(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nobjc_allocateProtocol(memAddress(name));
	}

	/** CharSequence version of: {@link #objc_allocateProtocol} */
	public static long objc_allocateProtocol(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobjc_allocateProtocol(__buffer.address(nameEncoded));
	}

	// --- [ objc_registerProtocol ] ---

	/**
	 * Registers a newly created protocol with the Objective-C runtime.
	 * 
	 * <p>When you create a new protocol using the {@link #objc_allocateProtocol}, you then register it with the Objective-C runtime by calling this function. After a
	 * protocol is successfully registered, it is immutable and ready to use.</p>
	 *
	 * @param proto the protocol you want to register with the Objective-C runtime
	 */
	public static void objc_registerProtocol(long proto) {
		long __functionAddress = getInstance().objc_registerProtocol;
		if ( CHECKS )
			checkPointer(proto);
		invokePV(__functionAddress, proto);
	}

	// --- [ protocol_addMethodDescription ] ---

	/** Unsafe version of {@link #protocol_addMethodDescription} */
	@JavadocExclude
	public static void nprotocol_addMethodDescription(long proto, long name, long types, byte isRequiredMethod, byte isInstanceMethod) {
		long __functionAddress = getInstance().protocol_addMethodDescription;
		if ( CHECKS ) {
			checkPointer(proto);
			checkPointer(name);
		}
		invokePPPBBV(__functionAddress, proto, name, types, isRequiredMethod, isInstanceMethod);
	}

	/**
	 * Adds a method to a protocol.
	 * 
	 * <p>To add a method to a protocol using this function, the protocol must be under construction. That is, you must add any methods to proto before you
	 * register it with the Objective-C runtime (via the {@link #objc_registerProtocol} function).</p>
	 *
	 * @param proto            the protocol you want to add a method to
	 * @param name             the name of the method you want to add
	 * @param types            a C string representing the signature of the method you want to add
	 * @param isRequiredMethod a Boolean indicating whether the method is a required method of the {@code proto} protocol. If {@link #YES}, the method is a required method; if {@link #NO}, the
	 *                         method is an optional method.
	 * @param isInstanceMethod a Boolean indicating whether the method is an instance method. If {@link #YES}, the method is an instance method; if {@link #NO}, the method is a class method.
	 */
	public static void protocol_addMethodDescription(long proto, long name, ByteBuffer types, byte isRequiredMethod, byte isInstanceMethod) {
		if ( CHECKS )
			checkNT1(types);
		nprotocol_addMethodDescription(proto, name, memAddress(types), isRequiredMethod, isInstanceMethod);
	}

	/** CharSequence version of: {@link #protocol_addMethodDescription} */
	public static void protocol_addMethodDescription(long proto, long name, CharSequence types, byte isRequiredMethod, byte isInstanceMethod) {
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		nprotocol_addMethodDescription(proto, name, __buffer.address(typesEncoded), isRequiredMethod, isInstanceMethod);
	}

	// --- [ protocol_addProtocol ] ---

	/**
	 * Adds a registered protocol to another protocol that is under construction.
	 * 
	 * <p>The protocol you want to add to ({@code proto}) must be under construction &ndash; allocated but not yet registered with the Objective-C runtime. The
	 * protocol you want to add ({@code addition}) must be registered already.</p>
	 *
	 * @param proto    the protocol you want to add the registered protocol to
	 * @param addition the registered protocol you want to add to {@code proto}
	 */
	public static void protocol_addProtocol(long proto, long addition) {
		long __functionAddress = getInstance().protocol_addProtocol;
		if ( CHECKS ) {
			checkPointer(proto);
			checkPointer(addition);
		}
		invokePPV(__functionAddress, proto, addition);
	}

	// --- [ protocol_addProperty ] ---

	/** Unsafe version of {@link #protocol_addProperty} */
	@JavadocExclude
	public static void nprotocol_addProperty(long proto, long name, long attributes, int attributeCount, byte isRequiredProperty, byte isInstanceProperty) {
		long __functionAddress = getInstance().protocol_addProperty;
		if ( CHECKS )
			checkPointer(proto);
		invokePPPIBBV(__functionAddress, proto, name, attributes, attributeCount, isRequiredProperty, isInstanceProperty);
	}

	/**
	 * Adds a property to a protocol that is under construction.
	 * 
	 * <p>The protocol you want to add the property to must be under construction &ndash; allocated but not yet registered with the Objective-C runtime (via the
	 * {@link #objc_registerProtocol} function).</p>
	 *
	 * @param proto              the protocol you want to add a property to
	 * @param name               the name of the property you want to add.
	 * @param attributes         an array of property attributes
	 * @param attributeCount     the number of properties in {@code attributes}
	 * @param isRequiredProperty a Boolean indicating whether the property's accessor methods are required methods of the {@code proto} protocol. If {@link #YES}, the property's accessor
	 *                           methods are required methods; if {@link #NO}, the property's accessor methods are optional methods.
	 * @param isInstanceProperty a Boolean indicating whether the property's accessor methods are instance methods. If {@link #YES}, the property's accessor methods are instance methods.
	 *                           {@link #YES} is the only value allowed for a property. As a result, if you set this value to {@link #NO}, the property will not be added to the protocol.
	 */
	public static void protocol_addProperty(long proto, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes, int attributeCount, byte isRequiredProperty, byte isInstanceProperty) {
		if ( CHECKS ) {
			checkNT1(name);
			checkBuffer(attributes, attributeCount);
		}
		nprotocol_addProperty(proto, memAddress(name), attributes.address(), attributeCount, isRequiredProperty, isInstanceProperty);
	}

	/** Alternative version of: {@link #protocol_addProperty} */
	public static void protocol_addProperty(long proto, ByteBuffer name, ObjCPropertyAttribute.Buffer attributes, byte isRequiredProperty, byte isInstanceProperty) {
		nprotocol_addProperty(proto, memAddress(name), attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
	}

	/** CharSequence version of: {@link #protocol_addProperty} */
	public static void protocol_addProperty(long proto, CharSequence name, ObjCPropertyAttribute.Buffer attributes, byte isRequiredProperty, byte isInstanceProperty) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		nprotocol_addProperty(proto, __buffer.address(nameEncoded), attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
	}

	// --- [ objc_copyImageNames ] ---

	/** Unsafe version of {@link #objc_copyImageNames} */
	@JavadocExclude
	public static long nobjc_copyImageNames(long outCount) {
		long __functionAddress = getInstance().objc_copyImageNames;
		return invokePP(__functionAddress, outCount);
	}

	/**
	 * Returns the names of all the loaded Objective-C frameworks and dynamic libraries.
	 *
	 * @return an array of C strings representing the names of all the loaded Objective-C frameworks and dynamic libraries
	 */
	public static PointerBuffer objc_copyImageNames() {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nobjc_copyImageNames(__buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ class_getImageName ] ---

	/** Unsafe version of {@link #class_getImageName} */
	@JavadocExclude
	public static long nclass_getImageName(long cls) {
		long __functionAddress = getInstance().class_getImageName;
		if ( CHECKS )
			checkPointer(cls);
		return invokePP(__functionAddress, cls);
	}

	/**
	 * Returns the name of the dynamic library a class originated from.
	 *
	 * @param cls the class you are inquiring about
	 *
	 * @return a C string representing the name of the library containing the {@code cls} class.
	 */
	public static String class_getImageName(long cls) {
		long __result = nclass_getImageName(cls);
		return memDecodeUTF8(__result);
	}

	// --- [ objc_copyClassNamesForImage ] ---

	/** Unsafe version of {@link #objc_copyClassNamesForImage} */
	@JavadocExclude
	public static long nobjc_copyClassNamesForImage(long image, long outCount) {
		long __functionAddress = getInstance().objc_copyClassNamesForImage;
		return invokePPP(__functionAddress, image, outCount);
	}

	/**
	 * Returns the names of all the classes within a specified library or framework.
	 *
	 * @param image the library or framework you are inquiring about
	 *
	 * @return an array of C strings representing all of the class names within the specified library or framework
	 */
	public static PointerBuffer objc_copyClassNamesForImage(ByteBuffer image) {
		if ( CHECKS )
			checkNT1(image);
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nobjc_copyClassNamesForImage(memAddress(image), __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	/** CharSequence version of: {@link #objc_copyClassNamesForImage} */
	public static PointerBuffer objc_copyClassNamesForImage(CharSequence image) {
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		int imageEncoded = __buffer.stringParamUTF8(image, true);
		long __result = nobjc_copyClassNamesForImage(__buffer.address(imageEncoded), __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ sel_getName ] ---

	/** Unsafe version of {@link #sel_getName} */
	@JavadocExclude
	public static long nsel_getName(long sel) {
		long __functionAddress = getInstance().sel_getName;
		if ( CHECKS )
			checkPointer(sel);
		return invokePP(__functionAddress, sel);
	}

	/**
	 * Returns the name of the method specified by a given selector.
	 *
	 * @param sel a pointer of type SEL. Pass the selector whose name you wish to determine.
	 *
	 * @return a C string indicating the name of the selector
	 */
	public static String sel_getName(long sel) {
		long __result = nsel_getName(sel);
		return memDecodeUTF8(__result);
	}

	// --- [ sel_getUid ] ---

	/** Unsafe version of {@link #sel_getUid} */
	@JavadocExclude
	public static long nsel_getUid(long str) {
		long __functionAddress = getInstance().sel_getUid;
		return invokePP(__functionAddress, str);
	}

	/**
	 * Registers a method name with the Objective-C runtime system.
	 * 
	 * <p>The implementation of this method is identical to the implementation of {@link #sel_registerName}.</p>
	 *
	 * @param str a pointer to a C string. Pass the name of the method you wish to register
	 *
	 * @return a pointer of type SEL specifying the selector for the named method
	 */
	public static long sel_getUid(ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nsel_getUid(memAddress(str));
	}

	/** CharSequence version of: {@link #sel_getUid} */
	public static long sel_getUid(CharSequence str) {
		APIBuffer __buffer = apiBuffer();
		int strEncoded = __buffer.stringParamUTF8(str, true);
		return nsel_getUid(__buffer.address(strEncoded));
	}

	// --- [ sel_registerName ] ---

	/** Unsafe version of {@link #sel_registerName} */
	@JavadocExclude
	public static long nsel_registerName(long str) {
		long __functionAddress = getInstance().sel_registerName;
		return invokePP(__functionAddress, str);
	}

	/**
	 * Registers a method with the Objective-C runtime system, maps the method name to a selector, and returns the selector value.
	 * 
	 * <p>You must register a method name with the Objective-C runtime system to obtain the method’s selector before you can add the method to a class
	 * definition. If the method name has already been registered, this function simply returns the selector.</p>
	 *
	 * @param str a pointer to a C string. Pass the name of the method you wish to register
	 *
	 * @return a pointer of type SEL specifying the selector for the named method
	 */
	public static long sel_registerName(ByteBuffer str) {
		if ( CHECKS )
			checkNT1(str);
		return nsel_registerName(memAddress(str));
	}

	/** CharSequence version of: {@link #sel_registerName} */
	public static long sel_registerName(CharSequence str) {
		APIBuffer __buffer = apiBuffer();
		int strEncoded = __buffer.stringParamUTF8(str, true);
		return nsel_registerName(__buffer.address(strEncoded));
	}

	// --- [ sel_isEqual ] ---

	/**
	 * Returns a Boolean value that indicates whether two selectors are equal.
	 * 
	 * <p>sel_isEqual is equivalent to {@code ==}.</p>
	 *
	 * @param lhs the selector to compare with {@code rhs}
	 * @param rhs the selector to compare with {@code lhs}
	 *
	 * @return {@link #YES} if rhs and rhs are equal, otherwise {@link #NO}
	 */
	public static byte sel_isEqual(long lhs, long rhs) {
		long __functionAddress = getInstance().sel_isEqual;
		if ( CHECKS ) {
			checkPointer(lhs);
			checkPointer(rhs);
		}
		return invokePPB(__functionAddress, lhs, rhs);
	}

	// --- [ objc_enumerationMutation ] ---

	/**
	 * Inserted by the compiler when a mutation is detected during a foreach iteration.
	 * 
	 * <p>The compiler inserts this function when it detects that an object is mutated during a foreach iteration. The function is called when a mutation occurs,
	 * and the enumeration mutation handler is enacted if it is set up (via the {@link #objc_setEnumerationMutationHandler} function). If the handler is not set up,
	 * a fatal error occurs.</p>
	 *
	 * @param obj the object being mutated
	 */
	public static void objc_enumerationMutation(long obj) {
		long __functionAddress = getInstance().objc_enumerationMutation;
		if ( CHECKS )
			checkPointer(obj);
		invokePV(__functionAddress, obj);
	}

	// --- [ objc_setEnumerationMutationHandler ] ---

	/**
	 * Sets the current mutation handler.
	 *
	 * @param handler a function pointer to the new mutation handler
	 */
	public static void objc_setEnumerationMutationHandler(EnumerationMutationHandler handler) {
		long __functionAddress = getInstance().objc_setEnumerationMutationHandler;
		invokePV(__functionAddress, handler.address());
	}

	// --- [ imp_implementationWithBlock ] ---

	/**
	 * Creates a pointer to a function that calls the specified block when the method is called.
	 *
	 * @param block the block that implements this method. The signature of {@code block} should be <code style="font-family: monospace">method_return_type ^(id self, self, method_args …)</code>. The
	 *              selector of the method is not available to {@code block}. {@code block} is copied with <code style="font-family: monospace">Block_copy()</code>.
	 *
	 * @return the IMP that calls {@code block}. You must dispose of the returned IMP using the function.
	 */
	public static long imp_implementationWithBlock(long block) {
		long __functionAddress = getInstance().imp_implementationWithBlock;
		if ( CHECKS )
			checkPointer(block);
		return invokePP(__functionAddress, block);
	}

	// --- [ imp_getBlock ] ---

	/**
	 * Returns the block associated with an IMP that was created using {@link #imp_implementationWithBlock}.
	 *
	 * @param anImp the IMP that calls this block
	 *
	 * @return the block called by {@code anImp}
	 */
	public static long imp_getBlock(long anImp) {
		long __functionAddress = getInstance().imp_getBlock;
		if ( CHECKS )
			checkPointer(anImp);
		return invokePP(__functionAddress, anImp);
	}

	// --- [ imp_removeBlock ] ---

	/**
	 * Disassociates a block from an IMP that was created using {@link #imp_implementationWithBlock}, and releases the copy of the block that was created.
	 *
	 * @param anImp an IMP that was created using the {@link #imp_implementationWithBlock} function.
	 *
	 * @return {@link #YES} if the block was released successfully; otherwise, {@link #NO} (for example, the function returns {@link #NO} if the block was not used to create {@code anImp}
	 *         previously).
	 */
	public static byte imp_removeBlock(long anImp) {
		long __functionAddress = getInstance().imp_removeBlock;
		if ( CHECKS )
			checkPointer(anImp);
		return invokePB(__functionAddress, anImp);
	}

	// --- [ objc_loadWeak ] ---

	/** Unsafe version of {@link #objc_loadWeak} */
	@JavadocExclude
	public static long nobjc_loadWeak(long location) {
		long __functionAddress = getInstance().objc_loadWeak;
		return invokePP(__functionAddress, location);
	}

	/**
	 * Loads the object referenced by a weak pointer and returns it.
	 * 
	 * <p>This function loads the object referenced by a weak pointer and returns it after retaining and autoreleasing the object. As a result, the object stays
	 * alive long enough for the caller to use it. This function is typically used anywhere a {@code __weak} variable is used in an expression.</p>
	 *
	 * @param location the address of the weak pointer
	 *
	 * @return the object pointed to by location, or {@link #nil} if location is {@link #nil}
	 */
	public static long objc_loadWeak(ByteBuffer location) {
		return nobjc_loadWeak(memAddressSafe(location));
	}

	/** Alternative version of: {@link #objc_loadWeak} */
	public static long objc_loadWeak(PointerBuffer location) {
		return nobjc_loadWeak(memAddressSafe(location));
	}

	// --- [ objc_storeWeak ] ---

	/** Unsafe version of {@link #objc_storeWeak} */
	@JavadocExclude
	public static long nobjc_storeWeak(long location, long obj) {
		long __functionAddress = getInstance().objc_storeWeak;
		if ( CHECKS )
			checkPointer(obj);
		return invokePPP(__functionAddress, location, obj);
	}

	/**
	 * Stores a new value in a {@code __weak} variable.
	 * 
	 * <p>This function is typically used anywhere a {@code __weak} variable is the target of an assignment.</p>
	 *
	 * @param location the address of the weak pointer
	 * @param obj      the new object you want the weak pointer to now point to
	 *
	 * @return the value stored in location (that is, {@code obj})
	 */
	public static long objc_storeWeak(ByteBuffer location, long obj) {
		return nobjc_storeWeak(memAddress(location), obj);
	}

	/** Alternative version of: {@link #objc_storeWeak} */
	public static long objc_storeWeak(PointerBuffer location, long obj) {
		return nobjc_storeWeak(memAddress(location), obj);
	}

	// --- [ objc_setAssociatedObject ] ---

	/**
	 * Sets an associated value for a given object using a given key and association policy.
	 *
	 * @param object the source object for the association
	 * @param key    the key for the association
	 * @param value  the value to associate with the key {@code key} for {@code object}. Pass {@link #nil} to clear an existing association.
	 * @param policy the policy for the association. One of:<br>{@link #OBJC_ASSOCIATION_ASSIGN}, {@link #OBJC_ASSOCIATION_RETAIN_NONATOMIC}, {@link #OBJC_ASSOCIATION_COPY_NONATOMIC}, {@link #OBJC_ASSOCIATION_RETAIN}, {@link #OBJC_ASSOCIATION_COPY}
	 */
	public static void objc_setAssociatedObject(long object, long key, long value, long policy) {
		long __functionAddress = getInstance().objc_setAssociatedObject;
		if ( CHECKS ) {
			checkPointer(object);
			checkPointer(key);
			checkPointer(value);
		}
		invokePPPPV(__functionAddress, object, key, value, policy);
	}

	// --- [ objc_getAssociatedObject ] ---

	/**
	 * Returns the value associated with a given object for a given key.
	 *
	 * @param object the source object for the association
	 * @param key    the key for the association
	 *
	 * @return the value associated with the key {@code key} for {@code object}.
	 */
	public static long objc_getAssociatedObject(long object, long key) {
		long __functionAddress = getInstance().objc_getAssociatedObject;
		if ( CHECKS ) {
			checkPointer(object);
			checkPointer(key);
		}
		return invokePPP(__functionAddress, object, key);
	}

	// --- [ objc_removeAssociatedObjects ] ---

	/**
	 * Removes all associations for a given object.
	 * 
	 * <p>The main purpose of this function is to make it easy to return an object to a "pristine state". You should not use this function for general removal of
	 * associations from objects, since it also removes associations that other clients may have added to the object. Typically you should use
	 * {@link #objc_setAssociatedObject} with a {@link #nil} value to clear an association.</p>
	 *
	 * @param object an object that maintains associated objects
	 */
	public static void objc_removeAssociatedObjects(long object) {
		long __functionAddress = getInstance().objc_removeAssociatedObjects;
		if ( CHECKS )
			checkPointer(object);
		invokePV(__functionAddress, object);
	}

}