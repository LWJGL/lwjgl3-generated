/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to Objective-C Runtime. */
public final class ObjCRuntime {

	/** Nil value. */
	public static final long nil = 0x0L;

	/** Boolean values. */
	public static final byte
		YES = 0x1,
		NO  = 0x0;

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

	static { LWJGLUtil.initialize(); }

	private ObjCRuntime() {}

	// --- [ object_copy ] ---

	/** JNI method for {@link #object_copy} */
	@JavadocExclude
	public static native long nobject_copy(long obj, long size);

	/**
	 * Returns a copy of a given object.
	 *
	 * @param obj  an Objective-C object
	 * @param size the size of the object {@code obj}
	 *
	 * @return a copy of obj
	 */
	public static long object_copy(long obj, long size) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobject_copy(obj, size);
	}

	// --- [ object_dispose ] ---

	/** JNI method for {@link #object_dispose} */
	@JavadocExclude
	public static native long nobject_dispose(long obj);

	/**
	 * Frees the memory occupied by a given object.
	 *
	 * @param obj an Objective-C object
	 *
	 * @return {@link #nil}
	 */
	public static long object_dispose(long obj) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobject_dispose(obj);
	}

	// --- [ object_getClass ] ---

	/**
	 * Returns the class of an object.
	 *
	 * @param obj an Objective-C object
	 *
	 * @return the class object of which object is an instance, or Nil if {@code obj} is {@link #nil}
	 */
	public static native long object_getClass(long obj);

	// --- [ object_setClass ] ---

	/** JNI method for {@link #object_setClass} */
	@JavadocExclude
	public static native long nobject_setClass(long obj, long cls);

	/**
	 * Sets the class of an object.
	 *
	 * @param obj the object to modify
	 * @param cls a class object
	 *
	 * @return the previous value of object's class, or Nil if {@code obj} is {@link #nil}
	 */
	public static long object_setClass(long obj, long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		return nobject_setClass(obj, cls);
	}

	// --- [ object_getClassName ] ---

	/** JNI method for {@link #object_getClassName} */
	@JavadocExclude
	public static native long nobject_getClassName(long obj);

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

	/** JNI method for {@link #object_getIndexedIvars} */
	@JavadocExclude
	public static native long nobject_getIndexedIvars(long obj);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobject_getIndexedIvars(obj);
	}

	// --- [ object_getIvar ] ---

	/** JNI method for {@link #object_getIvar} */
	@JavadocExclude
	public static native long nobject_getIvar(long obj, long ivar);

	/**
	 * Reads the value of an instance variable in an object.
	 *
	 * @param obj  the object containing the instance variable whose value you want to read
	 * @param ivar the Ivar describing the instance variable whose value you want to read
	 *
	 * @return the value of the instance variable specified by {@code ivar}, or {@link #nil} if {@code obj} is {@link #nil}
	 */
	public static long object_getIvar(long obj, long ivar) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ivar);
		return nobject_getIvar(obj, ivar);
	}

	// --- [ object_setIvar ] ---

	/** JNI method for {@link #object_setIvar} */
	@JavadocExclude
	public static native void nobject_setIvar(long obj, long ivar, long value);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(obj);
			checkPointer(ivar);
			checkPointer(value);
		}
		nobject_setIvar(obj, ivar, value);
	}

	// --- [ object_setInstanceVariable ] ---

	/** JNI method for {@link #object_setInstanceVariable} */
	@JavadocExclude
	public static native long nobject_setInstanceVariable(long obj, long name, long value);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(obj);
			checkNT1(name);
		}
		return nobject_setInstanceVariable(obj, memAddress(name), memAddress(value));
	}

	/** CharSequence version of: {@link #object_setInstanceVariable} */
	public static long object_setInstanceVariable(long obj, CharSequence name, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobject_setInstanceVariable(obj, __buffer.address(nameEncoded), memAddress(value));
	}

	// --- [ object_getInstanceVariable ] ---

	/** JNI method for {@link #object_getInstanceVariable} */
	@JavadocExclude
	public static native long nobject_getInstanceVariable(long obj, long name, long outValue);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(obj);
			checkNT1(name);
		}
		return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
	}

	/** Alternative version of: {@link #object_getInstanceVariable} */
	public static long object_getInstanceVariable(long obj, ByteBuffer name, PointerBuffer outValue) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
	}

	/** CharSequence version of: {@link #object_getInstanceVariable} */
	public static long object_getInstanceVariable(long obj, CharSequence name, PointerBuffer outValue) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nobject_getInstanceVariable(obj, __buffer.address(nameEncoded), memAddress(outValue));
	}

	// --- [ objc_getClass ] ---

	/** JNI method for {@link #objc_getClass} */
	@JavadocExclude
	public static native long nobjc_getClass(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_getMetaClass} */
	@JavadocExclude
	public static native long nobjc_getMetaClass(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_lookUpClass} */
	@JavadocExclude
	public static native long nobjc_lookUpClass(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_getRequiredClass} */
	@JavadocExclude
	public static native long nobjc_getRequiredClass(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_getClassList} */
	@JavadocExclude
	public static native int nobjc_getClassList(long buffer, int bufferCount);

	/**
	 * Obtains the list of registered class definitions.
	 * 
	 * <p>The Objective-C runtime library automatically registers all the classes defined in your source code. You can create class definitions at runtime and
	 * register them with the {@link #objc_addClass} function.</p>
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
		if ( LWJGLUtil.CHECKS )
			if ( buffer != null ) checkBuffer(buffer, bufferCount << POINTER_SHIFT);
		return nobjc_getClassList(memAddressSafe(buffer), bufferCount);
	}

	/** Alternative version of: {@link #objc_getClassList} */
	public static int objc_getClassList(PointerBuffer buffer) {
		return nobjc_getClassList(memAddressSafe(buffer), buffer == null ? 0 : buffer.remaining());
	}

	// --- [ objc_copyClassList ] ---

	/** JNI method for {@link #objc_copyClassList} */
	@JavadocExclude
	public static native long nobjc_copyClassList(long outCount);

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

	/** JNI method for {@link #class_getName} */
	@JavadocExclude
	public static native long nclass_getName(long cls);

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
	public static native byte class_isMetaClass(long cls);

	// --- [ class_getSuperclass ] ---

	/**
	 * Returns the superclass of a class.
	 *
	 * @param cls a class object
	 *
	 * @return the superclass of the class, or Nil if cls is a root class, or Nil if cls is Nil
	 */
	public static native long class_getSuperclass(long cls);

	// --- [ class_getVersion ] ---

	/** JNI method for {@link #class_getVersion} */
	@JavadocExclude
	public static native int nclass_getVersion(long cls);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		return nclass_getVersion(cls);
	}

	// --- [ class_setVersion ] ---

	/** JNI method for {@link #class_setVersion} */
	@JavadocExclude
	public static native void nclass_setVersion(long cls, int version);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		nclass_setVersion(cls, version);
	}

	// --- [ class_getInstanceSize ] ---

	/**
	 * Returns the size of instances of a class.
	 *
	 * @param cls a class object
	 *
	 * @return the size in bytes of instances of the class {@code cls}, or 0 if {@code cls} is Nil
	 */
	public static native long class_getInstanceSize(long cls);

	// --- [ class_getInstanceVariable ] ---

	/** JNI method for {@link #class_getInstanceVariable} */
	@JavadocExclude
	public static native long nclass_getInstanceVariable(long cls, long name);

	/**
	 * Returns the Ivar for a specified instance variable of a given class.
	 *
	 * @param cls  the class whose instance variable you wish to obtain
	 * @param name the name of the instance variable definition to obtain
	 *
	 * @return a pointer to an Ivar data structure containing information about the instance variable specified by name
	 */
	public static long class_getInstanceVariable(long cls, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(name);
		}
		return nclass_getInstanceVariable(cls, memAddress(name));
	}

	/** CharSequence version of: {@link #class_getInstanceVariable} */
	public static long class_getInstanceVariable(long cls, CharSequence name) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_getInstanceVariable(cls, __buffer.address(nameEncoded));
	}

	// --- [ class_getClassVariable ] ---

	/** JNI method for {@link #class_getClassVariable} */
	@JavadocExclude
	public static native long nclass_getClassVariable(long cls, long name);

	/**
	 * Returns the Ivar for a specified class variable of a given class.
	 *
	 * @param cls  the class definition whose class variable you wish to obtain
	 * @param name the name of the class variable definition to obtain
	 *
	 * @return a pointer to an Ivar data structure containing information about the class variable specified by name
	 */
	public static long class_getClassVariable(long cls, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(name);
		}
		return nclass_getClassVariable(cls, memAddress(name));
	}

	/** CharSequence version of: {@link #class_getClassVariable} */
	public static long class_getClassVariable(long cls, CharSequence name) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_getClassVariable(cls, __buffer.address(nameEncoded));
	}

	// --- [ class_copyIvarList ] ---

	/** JNI method for {@link #class_copyIvarList} */
	@JavadocExclude
	public static native long nclass_copyIvarList(long cls, long outCount);

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

	/** JNI method for {@link #class_getInstanceMethod} */
	@JavadocExclude
	public static native long nclass_getInstanceMethod(long cls, long name);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return nclass_getInstanceMethod(cls, name);
	}

	// --- [ class_getClassMethod ] ---

	/** JNI method for {@link #class_getClassMethod} */
	@JavadocExclude
	public static native long nclass_getClassMethod(long cls, long name);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return nclass_getClassMethod(cls, name);
	}

	// --- [ class_getMethodImplementation ] ---

	/** JNI method for {@link #class_getMethodImplementation} */
	@JavadocExclude
	public static native long nclass_getMethodImplementation(long cls, long name);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(name);
		return nclass_getMethodImplementation(cls, name);
	}

	// --- [ class_respondsToSelector ] ---

	/** JNI method for {@link #class_respondsToSelector} */
	@JavadocExclude
	public static native byte nclass_respondsToSelector(long cls, long name);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
		}
		return nclass_respondsToSelector(cls, name);
	}

	// --- [ class_copyMethodList ] ---

	/** JNI method for {@link #class_copyMethodList} */
	@JavadocExclude
	public static native long nclass_copyMethodList(long cls, long outCount);

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

	/** JNI method for {@link #class_conformsToProtocol} */
	@JavadocExclude
	public static native byte nclass_conformsToProtocol(long cls, long protocol);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(protocol);
		}
		return nclass_conformsToProtocol(cls, protocol);
	}

	// --- [ class_copyProtocolList ] ---

	/** JNI method for {@link #class_copyProtocolList} */
	@JavadocExclude
	public static native long nclass_copyProtocolList(long cls, long outCount);

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

	/** JNI method for {@link #class_getProperty} */
	@JavadocExclude
	public static native long nclass_getProperty(long cls, long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #class_copyPropertyList} */
	@JavadocExclude
	public static native long nclass_copyPropertyList(long cls, long outCount);

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

	/** JNI method for {@link #class_getIvarLayout} */
	@JavadocExclude
	public static native long nclass_getIvarLayout(long cls);

	/**
	 * Returns a description of the Ivar layout for a given class.
	 *
	 * @param cls the class to inspect
	 *
	 * @return a description of the Ivar layout for {@code cls}
	 */
	public static String class_getIvarLayout(long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		long __result = nclass_getIvarLayout(cls);
		return memDecodeASCII(__result);
	}

	// --- [ class_getWeakIvarLayout ] ---

	/** JNI method for {@link #class_getWeakIvarLayout} */
	@JavadocExclude
	public static native long nclass_getWeakIvarLayout(long cls);

	/**
	 * Returns a description of the layout of weak Ivars for a given class.
	 *
	 * @param cls the class to inspect
	 *
	 * @return a description of the layout of the weak Ivars for {@code cls}
	 */
	public static String class_getWeakIvarLayout(long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		long __result = nclass_getWeakIvarLayout(cls);
		return memDecodeASCII(__result);
	}

	// --- [ class_addMethod ] ---

	/** JNI method for {@link #class_addMethod} */
	@JavadocExclude
	public static native byte nclass_addMethod(long cls, long name, long imp, long types);

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
	 *     // implementation ....
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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
			checkNT1(types);
		}
		return nclass_addMethod(cls, name, imp, memAddress(types));
	}

	/** CharSequence version of: {@link #class_addMethod} */
	public static byte class_addMethod(long cls, long name, long imp, CharSequence types) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
		}
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_addMethod(cls, name, imp, __buffer.address(typesEncoded));
	}

	// --- [ class_replaceMethod ] ---

	/** JNI method for {@link #class_replaceMethod} */
	@JavadocExclude
	public static native long nclass_replaceMethod(long cls, long name, long imp, long types);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
			checkNT1(types);
		}
		return nclass_replaceMethod(cls, name, imp, memAddress(types));
	}

	/** CharSequence version of: {@link #class_replaceMethod} */
	public static long class_replaceMethod(long cls, long name, long imp, CharSequence types) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(name);
			checkPointer(imp);
		}
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_replaceMethod(cls, name, imp, __buffer.address(typesEncoded));
	}

	// --- [ class_addIvar ] ---

	/** JNI method for {@link #class_addIvar} */
	@JavadocExclude
	public static native byte nclass_addIvar(long cls, long name, long size, byte alignment, long types);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(name);
			checkNT1(types);
		}
		return nclass_addIvar(cls, memAddress(name), size, alignment, memAddress(types));
	}

	/** CharSequence version of: {@link #class_addIvar} */
	public static byte class_addIvar(long cls, CharSequence name, long size, byte alignment, CharSequence types) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		return nclass_addIvar(cls, __buffer.address(nameEncoded), size, alignment, __buffer.address(typesEncoded));
	}

	// --- [ class_addProtocol ] ---

	/** JNI method for {@link #class_addProtocol} */
	@JavadocExclude
	public static native byte nclass_addProtocol(long cls, long protocol);

	/**
	 * Adds a protocol to a class.
	 *
	 * @param cls      the class to modify
	 * @param protocol the protocol to add to {@code cls}
	 *
	 * @return {@link #YES} if the protocol was added successfully, otherwise {@link #NO} (for example, the class already conforms to that protocol)
	 */
	public static byte class_addProtocol(long cls, long protocol) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkPointer(protocol);
		}
		return nclass_addProtocol(cls, protocol);
	}

	// --- [ class_addProperty ] ---

	/** JNI method for {@link #class_addProperty} */
	@JavadocExclude
	public static native byte nclass_addProperty(long cls, long name, long attributes, int attributeCount);

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
	public static byte class_addProperty(long cls, ByteBuffer name, ByteBuffer attributes, int attributeCount) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(name);
			checkBuffer(attributes, attributeCount * ObjCPropertyAttribute.SIZEOF);
		}
		return nclass_addProperty(cls, memAddress(name), memAddress(attributes), attributeCount);
	}

	/** Alternative version of: {@link #class_addProperty} */
	public static byte class_addProperty(long cls, ByteBuffer name, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		return nclass_addProperty(cls, memAddress(name), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF);
	}

	/** CharSequence version of: {@link #class_addProperty} */
	public static byte class_addProperty(long cls, CharSequence name, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nclass_addProperty(cls, __buffer.address(nameEncoded), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF);
	}

	// --- [ class_replaceProperty ] ---

	/** JNI method for {@link #class_replaceProperty} */
	@JavadocExclude
	public static native void nclass_replaceProperty(long cls, long name, long attributes, int attributeCount);

	/**
	 * Replaces a property of a class.
	 *
	 * @param cls            the class to modify
	 * @param name           the name of the property
	 * @param attributes     an array of property attributes
	 * @param attributeCount the number of attributes in {@code attributes}
	 */
	public static void class_replaceProperty(long cls, ByteBuffer name, ByteBuffer attributes, int attributeCount) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(name);
			checkBuffer(attributes, attributeCount * ObjCPropertyAttribute.SIZEOF);
		}
		nclass_replaceProperty(cls, memAddress(name), memAddress(attributes), attributeCount);
	}

	/** Alternative version of: {@link #class_replaceProperty} */
	public static void class_replaceProperty(long cls, ByteBuffer name, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		nclass_replaceProperty(cls, memAddress(name), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF);
	}

	/** CharSequence version of: {@link #class_replaceProperty} */
	public static void class_replaceProperty(long cls, CharSequence name, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		nclass_replaceProperty(cls, __buffer.address(nameEncoded), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF);
	}

	// --- [ class_setIvarLayout ] ---

	/** JNI method for {@link #class_setIvarLayout} */
	@JavadocExclude
	public static native void nclass_setIvarLayout(long cls, long layout);

	/**
	 * Sets the Ivar layout for a given class.
	 *
	 * @param cls    the class to modify
	 * @param layout the layout of the Ivars for {@code cls}
	 */
	public static void class_setIvarLayout(long cls, ByteBuffer layout) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(layout);
		}
		nclass_setIvarLayout(cls, memAddress(layout));
	}

	/** CharSequence version of: {@link #class_setIvarLayout} */
	public static void class_setIvarLayout(long cls, CharSequence layout) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int layoutEncoded = __buffer.stringParamASCII(layout, true);
		nclass_setIvarLayout(cls, __buffer.address(layoutEncoded));
	}

	// --- [ class_setWeakIvarLayout ] ---

	/** JNI method for {@link #class_setWeakIvarLayout} */
	@JavadocExclude
	public static native void nclass_setWeakIvarLayout(long cls, long layout);

	/**
	 * Sets the layout for weak Ivars for a given class.
	 *
	 * @param cls    the class to modify
	 * @param layout the layout of the weak Ivars for {@code cls}
	 */
	public static void class_setWeakIvarLayout(long cls, ByteBuffer layout) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(cls);
			checkNT1(layout);
		}
		nclass_setWeakIvarLayout(cls, memAddress(layout));
	}

	/** CharSequence version of: {@link #class_setWeakIvarLayout} */
	public static void class_setWeakIvarLayout(long cls, CharSequence layout) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		APIBuffer __buffer = apiBuffer();
		int layoutEncoded = __buffer.stringParamASCII(layout, true);
		nclass_setWeakIvarLayout(cls, __buffer.address(layoutEncoded));
	}

	// --- [ class_createInstance ] ---

	/** JNI method for {@link #class_createInstance} */
	@JavadocExclude
	public static native long nclass_createInstance(long cls, long extraBytes);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		return nclass_createInstance(cls, extraBytes);
	}

	// --- [ objc_constructInstance ] ---

	/** JNI method for {@link #objc_constructInstance} */
	@JavadocExclude
	public static native long nobjc_constructInstance(long cls, long bytes);

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

	/** JNI method for {@link #objc_destructInstance} */
	@JavadocExclude
	public static native long nobjc_destructInstance(long obj);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobjc_destructInstance(obj);
	}

	// --- [ objc_allocateClassPair ] ---

	/** JNI method for {@link #objc_allocateClassPair} */
	@JavadocExclude
	public static native long nobjc_allocateClassPair(long superclass, long name, long extraBytes);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_registerClassPair} */
	@JavadocExclude
	public static native void nobjc_registerClassPair(long cls);

	/**
	 * Registers a class that was allocated using {@link #objc_allocateClassPair}.
	 *
	 * @param cls the class you want to register
	 */
	public static void objc_registerClassPair(long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		nobjc_registerClassPair(cls);
	}

	// --- [ objc_disposeClassPair ] ---

	/** JNI method for {@link #objc_disposeClassPair} */
	@JavadocExclude
	public static native void nobjc_disposeClassPair(long cls);

	/**
	 * Destroys a class and its associated metaclass.
	 * 
	 * <p>Do not call this function if instances of the {@code cls} class or any subclass exist.</p>
	 *
	 * @param cls the class to be destroyed. This class must have been allocated using {@link #objc_allocateClassPair}.
	 */
	public static void objc_disposeClassPair(long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		nobjc_disposeClassPair(cls);
	}

	// --- [ method_getName ] ---

	/** JNI method for {@link #method_getName} */
	@JavadocExclude
	public static native long nmethod_getName(long m);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		return nmethod_getName(m);
	}

	// --- [ method_getImplementation ] ---

	/** JNI method for {@link #method_getImplementation} */
	@JavadocExclude
	public static native long nmethod_getImplementation(long m);

	/**
	 * Returns the implementation of a method.
	 *
	 * @param m the method to inspect
	 *
	 * @return a function pointer of type IMP
	 */
	public static long method_getImplementation(long m) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		return nmethod_getImplementation(m);
	}

	// --- [ method_getTypeEncoding ] ---

	/** JNI method for {@link #method_getTypeEncoding} */
	@JavadocExclude
	public static native long nmethod_getTypeEncoding(long m);

	/**
	 * Returns a string describing a method's parameter and return types.
	 *
	 * @param m the method to inspect
	 *
	 * @return a C string. The string may be {@code NULL}
	 */
	public static String method_getTypeEncoding(long m) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		long __result = nmethod_getTypeEncoding(m);
		return memDecodeUTF8(__result);
	}

	// --- [ method_getNumberOfArguments ] ---

	/** JNI method for {@link #method_getNumberOfArguments} */
	@JavadocExclude
	public static native int nmethod_getNumberOfArguments(long m);

	/**
	 * Returns the number of arguments accepted by a method.
	 *
	 * @param m a pointer to a Method data structure. Pass the method in question.
	 *
	 * @return an integer containing the number of arguments accepted by the given method
	 */
	public static int method_getNumberOfArguments(long m) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		return nmethod_getNumberOfArguments(m);
	}

	// --- [ method_copyReturnType ] ---

	/** JNI method for {@link #method_copyReturnType} */
	@JavadocExclude
	public static native long nmethod_copyReturnType(long m);

	/**
	 * Returns a string describing a method's return type.
	 *
	 * @param m the method to inspect
	 *
	 * @return a C string describing the return type. You must free the string with free().
	 */
	public static String method_copyReturnType(long m) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		long __result = nmethod_copyReturnType(m);
		return memDecodeUTF8(__result);
	}

	// --- [ method_copyArgumentType ] ---

	/** JNI method for {@link #method_copyArgumentType} */
	@JavadocExclude
	public static native long nmethod_copyArgumentType(long m, int index);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		long __result = nmethod_copyArgumentType(m, index);
		return memDecodeUTF8(__result);
	}

	// --- [ method_getReturnType ] ---

	/** JNI method for {@link #method_getReturnType} */
	@JavadocExclude
	public static native void nmethod_getReturnType(long m, long dst, long dst_len);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(m);
			checkBuffer(dst, dst_len);
		}
		nmethod_getReturnType(m, memAddress(dst), dst_len);
	}

	/** Alternative version of: {@link #method_getReturnType} */
	public static void method_getReturnType(long m, ByteBuffer dst) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		nmethod_getReturnType(m, memAddress(dst), dst.remaining());
	}

	/** String return version of: {@link #method_getReturnType} */
	public static String method_getReturnType(long m, long dst_len) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		APIBuffer __buffer = apiBuffer();
		int dst = __buffer.bufferParam((int)dst_len);
		nmethod_getReturnType(m, __buffer.address(dst), dst_len);
		return memDecodeUTF8(memByteBufferNT1(__buffer.address(dst), (int)dst_len));
	}

	// --- [ method_getArgumentType ] ---

	/** JNI method for {@link #method_getArgumentType} */
	@JavadocExclude
	public static native void nmethod_getArgumentType(long m, int index, long dst, long dst_len);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(m);
			checkBuffer(dst, dst_len);
		}
		nmethod_getArgumentType(m, index, memAddress(dst), dst_len);
	}

	/** Alternative version of: {@link #method_getArgumentType} */
	public static void method_getArgumentType(long m, int index, ByteBuffer dst) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		nmethod_getArgumentType(m, index, memAddress(dst), dst.remaining());
	}

	/** String return version of: {@link #method_getArgumentType} */
	public static String method_getArgumentType(long m, int index, long dst_len) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(m);
		APIBuffer __buffer = apiBuffer();
		int dst = __buffer.bufferParam((int)dst_len);
		nmethod_getArgumentType(m, index, __buffer.address(dst), dst_len);
		return memDecodeUTF8(memByteBufferNT1(__buffer.address(dst), (int)dst_len));
	}

	// --- [ method_setImplementation ] ---

	/** JNI method for {@link #method_setImplementation} */
	@JavadocExclude
	public static native long nmethod_setImplementation(long m, long imp);

	/**
	 * Sets the implementation of a method.
	 *
	 * @param m   the method for which to set an implementation
	 * @param imp the implemention to set to this method
	 *
	 * @return the previous implementation of the method
	 */
	public static long method_setImplementation(long m, long imp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(m);
			checkPointer(imp);
		}
		return nmethod_setImplementation(m, imp);
	}

	// --- [ method_exchangeImplementations ] ---

	/** JNI method for {@link #method_exchangeImplementations} */
	@JavadocExclude
	public static native void nmethod_exchangeImplementations(long m1, long m2);

	/**
	 * Exchanges the implementations of two methods.
	 *
	 * @param m1 the method to exchange with second method
	 * @param m2 the method to exchange with first method
	 */
	public static void method_exchangeImplementations(long m1, long m2) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(m1);
			checkPointer(m2);
		}
		nmethod_exchangeImplementations(m1, m2);
	}

	// --- [ ivar_getName ] ---

	/** JNI method for {@link #ivar_getName} */
	@JavadocExclude
	public static native long nivar_getName(long v);

	/**
	 * Returns the name of an instance variable.
	 *
	 * @param v the instance variable
	 *
	 * @return a C string containing the instance variable's name
	 */
	public static String ivar_getName(long v) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(v);
		long __result = nivar_getName(v);
		return memDecodeUTF8(__result);
	}

	// --- [ ivar_getTypeEncoding ] ---

	/** JNI method for {@link #ivar_getTypeEncoding} */
	@JavadocExclude
	public static native long nivar_getTypeEncoding(long v);

	/**
	 * Returns the type string of an instance variable.
	 *
	 * @param v the instance variable
	 *
	 * @return a C string containing the instance variable's type encoding
	 */
	public static String ivar_getTypeEncoding(long v) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(v);
		long __result = nivar_getTypeEncoding(v);
		return memDecodeUTF8(__result);
	}

	// --- [ ivar_getOffset ] ---

	/** JNI method for {@link #ivar_getOffset} */
	@JavadocExclude
	public static native long nivar_getOffset(long v);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(v);
		return nivar_getOffset(v);
	}

	// --- [ property_getName ] ---

	/** JNI method for {@link #property_getName} */
	@JavadocExclude
	public static native long nproperty_getName(long property);

	/**
	 * Returns the name of a property.
	 *
	 * @param property the property you want to inquire about
	 *
	 * @return a C string containing the property's name
	 */
	public static String property_getName(long property) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
		long __result = nproperty_getName(property);
		return memDecodeUTF8(__result);
	}

	// --- [ property_getAttributes ] ---

	/** JNI method for {@link #property_getAttributes} */
	@JavadocExclude
	public static native long nproperty_getAttributes(long property);

	/**
	 * Returns the attribute string of a property.
	 *
	 * @param property a property
	 *
	 * @return a C string containing the property's attributes
	 */
	public static String property_getAttributes(long property) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
		long __result = nproperty_getAttributes(property);
		return memDecodeUTF8(__result);
	}

	// --- [ property_copyAttributeList ] ---

	/** JNI method for {@link #property_copyAttributeList} */
	@JavadocExclude
	public static native long nproperty_copyAttributeList(long property, long outCount);

	/**
	 * Returns an array of property attributes for a given property.
	 *
	 * @param property the property whose attributes you want to copy
	 * @param outCount the number of attributes returned in the array
	 *
	 * @return an array of property attributes. You must free the array with free().
	 */
	public static ByteBuffer property_copyAttributeList(long property, ByteBuffer outCount) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
		long __result = nproperty_copyAttributeList(property, memAddress(outCount));
		return memByteBuffer(__result, outCount.getInt(outCount.position()) * ObjCPropertyAttribute.SIZEOF);
	}

	/** Alternative version of: {@link #property_copyAttributeList} */
	public static ByteBuffer property_copyAttributeList(long property, IntBuffer outCount) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
		long __result = nproperty_copyAttributeList(property, memAddress(outCount));
		return memByteBuffer(__result, outCount.get(outCount.position()) * ObjCPropertyAttribute.SIZEOF);
	}

	// --- [ property_copyAttributeValue ] ---

	/** JNI method for {@link #property_copyAttributeValue} */
	@JavadocExclude
	public static native long nproperty_copyAttributeValue(long property, long attributeName);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
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
		if ( LWJGLUtil.CHECKS )
			checkPointer(property);
		APIBuffer __buffer = apiBuffer();
		int attributeNameEncoded = __buffer.stringParamUTF8(attributeName, true);
		long __result = nproperty_copyAttributeValue(property, __buffer.address(attributeNameEncoded));
		return memDecodeUTF8(__result);
	}

	// --- [ objc_getProtocol ] ---

	/** JNI method for {@link #objc_getProtocol} */
	@JavadocExclude
	public static native long nobjc_getProtocol(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_copyProtocolList} */
	@JavadocExclude
	public static native long nobjc_copyProtocolList(long outCount);

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

	/** JNI method for {@link #protocol_conformsToProtocol} */
	@JavadocExclude
	public static native byte nprotocol_conformsToProtocol(long proto, long other);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkPointer(other);
		}
		return nprotocol_conformsToProtocol(proto, other);
	}

	// --- [ protocol_isEqual ] ---

	/** JNI method for {@link #protocol_isEqual} */
	@JavadocExclude
	public static native byte nprotocol_isEqual(long proto, long other);

	/**
	 * Returns a Boolean value that indicates whether two protocols are equal.
	 *
	 * @param proto a protocol
	 * @param other a protocol
	 *
	 * @return {@link #YES} if proto is the same as other, otherwise {@link #NO}
	 */
	public static byte protocol_isEqual(long proto, long other) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkPointer(other);
		}
		return nprotocol_isEqual(proto, other);
	}

	// --- [ protocol_getName ] ---

	/** JNI method for {@link #protocol_getName} */
	@JavadocExclude
	public static native long nprotocol_getName(long p);

	/**
	 * Returns a the name of a protocol.
	 *
	 * @param p a protocol
	 *
	 * @return the name of the protocol {@code p} as a C string
	 */
	public static String protocol_getName(long p) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(p);
		long __result = nprotocol_getName(p);
		return memDecodeUTF8(__result);
	}

	// --- [ protocol_getMethodDescription ] ---

	/** JNI method for {@link #protocol_getMethodDescription} */
	@JavadocExclude
	public static native void nprotocol_getMethodDescription(long p, long aSel, byte isRequiredMethod, byte isInstanceMethod, long __result);

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
	public static void protocol_getMethodDescription(long p, long aSel, byte isRequiredMethod, byte isInstanceMethod, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(p);
			checkPointer(aSel);
		}
		nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, memAddress(__result));
	}

	// --- [ protocol_copyMethodDescriptionList ] ---

	/** JNI method for {@link #protocol_copyMethodDescriptionList} */
	@JavadocExclude
	public static native long nprotocol_copyMethodDescriptionList(long p, byte isRequiredMethod, byte isInstanceMethod, long outCount);

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
	public static ByteBuffer protocol_copyMethodDescriptionList(long p, byte isRequiredMethod, byte isInstanceMethod, ByteBuffer outCount) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(p);
		long __result = nprotocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, memAddress(outCount));
		return memByteBuffer(__result, outCount.getInt(outCount.position()) * ObjCMethodDescription.SIZEOF);
	}

	/** Alternative version of: {@link #protocol_copyMethodDescriptionList} */
	public static ByteBuffer protocol_copyMethodDescriptionList(long p, byte isRequiredMethod, byte isInstanceMethod, IntBuffer outCount) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(p);
		long __result = nprotocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, memAddress(outCount));
		return memByteBuffer(__result, outCount.get(outCount.position()) * ObjCMethodDescription.SIZEOF);
	}

	// --- [ protocol_getProperty ] ---

	/** JNI method for {@link #protocol_getProperty} */
	@JavadocExclude
	public static native long nprotocol_getProperty(long proto, long name, byte isRequiredProperty, byte isInstanceProperty);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkNT1(name);
		}
		return nprotocol_getProperty(proto, memAddress(name), isRequiredProperty, isInstanceProperty);
	}

	/** CharSequence version of: {@link #protocol_getProperty} */
	public static long protocol_getProperty(long proto, CharSequence name, byte isRequiredProperty, byte isInstanceProperty) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nprotocol_getProperty(proto, __buffer.address(nameEncoded), isRequiredProperty, isInstanceProperty);
	}

	// --- [ protocol_copyPropertyList ] ---

	/** JNI method for {@link #protocol_copyPropertyList} */
	@JavadocExclude
	public static native long nprotocol_copyPropertyList(long proto, long outCount);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nprotocol_copyPropertyList(proto, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ protocol_copyProtocolList ] ---

	/** JNI method for {@link #protocol_copyProtocolList} */
	@JavadocExclude
	public static native long nprotocol_copyProtocolList(long proto, long outCount);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		APIBuffer __buffer = apiBuffer();
		int outCount = __buffer.intParam();
		long __result = nprotocol_copyProtocolList(proto, __buffer.address(outCount));
		return memPointerBuffer(__result, __buffer.intValue(outCount));
	}

	// --- [ objc_allocateProtocol ] ---

	/** JNI method for {@link #objc_allocateProtocol} */
	@JavadocExclude
	public static native long nobjc_allocateProtocol(long name);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #objc_registerProtocol} */
	@JavadocExclude
	public static native void nobjc_registerProtocol(long proto);

	/**
	 * Registers a newly created protocol with the Objective-C runtime.
	 * 
	 * <p>When you create a new protocol using the {@link #objc_allocateProtocol}, you then register it with the Objective-C runtime by calling this function. After a
	 * protocol is successfully registered, it is immutable and ready to use.</p>
	 *
	 * @param proto the protocol you want to register with the Objective-C runtime
	 */
	public static void objc_registerProtocol(long proto) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		nobjc_registerProtocol(proto);
	}

	// --- [ protocol_addMethodDescription ] ---

	/** JNI method for {@link #protocol_addMethodDescription} */
	@JavadocExclude
	public static native void nprotocol_addMethodDescription(long proto, long name, long types, byte isRequiredMethod, byte isInstanceMethod);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkPointer(name);
			checkNT1(types);
		}
		nprotocol_addMethodDescription(proto, name, memAddress(types), isRequiredMethod, isInstanceMethod);
	}

	/** CharSequence version of: {@link #protocol_addMethodDescription} */
	public static void protocol_addMethodDescription(long proto, long name, CharSequence types, byte isRequiredMethod, byte isInstanceMethod) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkPointer(name);
		}
		APIBuffer __buffer = apiBuffer();
		int typesEncoded = __buffer.stringParamUTF8(types, true);
		nprotocol_addMethodDescription(proto, name, __buffer.address(typesEncoded), isRequiredMethod, isInstanceMethod);
	}

	// --- [ protocol_addProtocol ] ---

	/** JNI method for {@link #protocol_addProtocol} */
	@JavadocExclude
	public static native void nprotocol_addProtocol(long proto, long addition);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkPointer(addition);
		}
		nprotocol_addProtocol(proto, addition);
	}

	// --- [ protocol_addProperty ] ---

	/** JNI method for {@link #protocol_addProperty} */
	@JavadocExclude
	public static native void nprotocol_addProperty(long proto, long name, long attributes, int attributeCount, byte isRequiredProperty, byte isInstanceProperty);

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
	public static void protocol_addProperty(long proto, ByteBuffer name, ByteBuffer attributes, int attributeCount, byte isRequiredProperty, byte isInstanceProperty) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(proto);
			checkNT1(name);
			checkBuffer(attributes, attributeCount * ObjCPropertyAttribute.SIZEOF);
		}
		nprotocol_addProperty(proto, memAddress(name), memAddress(attributes), attributeCount, isRequiredProperty, isInstanceProperty);
	}

	/** Alternative version of: {@link #protocol_addProperty} */
	public static void protocol_addProperty(long proto, ByteBuffer name, ByteBuffer attributes, byte isRequiredProperty, byte isInstanceProperty) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		nprotocol_addProperty(proto, memAddress(name), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF, isRequiredProperty, isInstanceProperty);
	}

	/** CharSequence version of: {@link #protocol_addProperty} */
	public static void protocol_addProperty(long proto, CharSequence name, ByteBuffer attributes, byte isRequiredProperty, byte isInstanceProperty) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(proto);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		nprotocol_addProperty(proto, __buffer.address(nameEncoded), memAddress(attributes), attributes.remaining() / ObjCPropertyAttribute.SIZEOF, isRequiredProperty, isInstanceProperty);
	}

	// --- [ objc_copyImageNames ] ---

	/** JNI method for {@link #objc_copyImageNames} */
	@JavadocExclude
	public static native long nobjc_copyImageNames(long outCount);

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

	/** JNI method for {@link #class_getImageName} */
	@JavadocExclude
	public static native long nclass_getImageName(long cls);

	/**
	 * Returns the name of the dynamic library a class originated from.
	 *
	 * @param cls the class you are inquiring about
	 *
	 * @return a C string representing the name of the library containing the {@code cls} class.
	 */
	public static String class_getImageName(long cls) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cls);
		long __result = nclass_getImageName(cls);
		return memDecodeUTF8(__result);
	}

	// --- [ objc_copyClassNamesForImage ] ---

	/** JNI method for {@link #objc_copyClassNamesForImage} */
	@JavadocExclude
	public static native long nobjc_copyClassNamesForImage(long image, long outCount);

	/**
	 * Returns the names of all the classes within a specified library or framework.
	 *
	 * @param image the library or framework you are inquiring about
	 *
	 * @return an array of C strings representing all of the class names within the specified library or framework
	 */
	public static PointerBuffer objc_copyClassNamesForImage(ByteBuffer image) {
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #sel_getName} */
	@JavadocExclude
	public static native long nsel_getName(long sel);

	/**
	 * Returns the name of the method specified by a given selector.
	 *
	 * @param sel a pointer of type SEL. Pass the selector whose name you wish to determine.
	 *
	 * @return a C string indicating the name of the selector
	 */
	public static String sel_getName(long sel) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(sel);
		long __result = nsel_getName(sel);
		return memDecodeUTF8(__result);
	}

	// --- [ sel_getUid ] ---

	/** JNI method for {@link #sel_getUid} */
	@JavadocExclude
	public static native long nsel_getUid(long str);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #sel_registerName} */
	@JavadocExclude
	public static native long nsel_registerName(long str);

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
		if ( LWJGLUtil.CHECKS )
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

	/** JNI method for {@link #sel_isEqual} */
	@JavadocExclude
	public static native byte nsel_isEqual(long lhs, long rhs);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(lhs);
			checkPointer(rhs);
		}
		return nsel_isEqual(lhs, rhs);
	}

	// --- [ objc_enumerationMutation ] ---

	/** JNI method for {@link #objc_enumerationMutation} */
	@JavadocExclude
	public static native void nobjc_enumerationMutation(long obj);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		nobjc_enumerationMutation(obj);
	}

	// --- [ objc_setEnumerationMutationHandler ] ---

	/** JNI method for {@link #objc_setEnumerationMutationHandler} */
	@JavadocExclude
	public static native void nobjc_setEnumerationMutationHandler(long handler);

	/**
	 * Sets the current mutation handler.
	 *
	 * @param handler a function pointer to the new mutation handler
	 */
	public static void objc_setEnumerationMutationHandler(EnumerationMutationHandler handler) {
		nobjc_setEnumerationMutationHandler(handler.getPointer());
	}

	// --- [ imp_implementationWithBlock ] ---

	/** JNI method for {@link #imp_implementationWithBlock} */
	@JavadocExclude
	public static native long nimp_implementationWithBlock(long block);

	/**
	 * Creates a pointer to a function that calls the specified block when the method is called.
	 *
	 * @param block the block that implements this method. The signature of {@code block} should be <code style="font-family: monospace">method_return_type ^(id self, self, method_args …)</code>. The
	 *              selector of the method is not available to {@code block}. {@code block} is copied with <code style="font-family: monospace">Block_copy()</code>.
	 *
	 * @return the IMP that calls {@code block}. You must dispose of the returned IMP using the function.
	 */
	public static long imp_implementationWithBlock(long block) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(block);
		return nimp_implementationWithBlock(block);
	}

	// --- [ imp_getBlock ] ---

	/** JNI method for {@link #imp_getBlock} */
	@JavadocExclude
	public static native long nimp_getBlock(long anImp);

	/**
	 * Returns the block associated with an IMP that was created using {@link #imp_implementationWithBlock}.
	 *
	 * @param anImp the IMP that calls this block
	 *
	 * @return the block called by {@code anImp}
	 */
	public static long imp_getBlock(long anImp) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(anImp);
		return nimp_getBlock(anImp);
	}

	// --- [ imp_removeBlock ] ---

	/** JNI method for {@link #imp_removeBlock} */
	@JavadocExclude
	public static native byte nimp_removeBlock(long anImp);

	/**
	 * Disassociates a block from an IMP that was created using {@link #imp_implementationWithBlock}, and releases the copy of the block that was created.
	 *
	 * @param anImp an IMP that was created using the {@link #imp_implementationWithBlock} function.
	 *
	 * @return {@link #YES} if the block was released successfully; otherwise, {@link #NO} (for example, the function returns {@link #NO} if the block was not used to create {@code anImp}
	 *         previously).
	 */
	public static byte imp_removeBlock(long anImp) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(anImp);
		return nimp_removeBlock(anImp);
	}

	// --- [ objc_loadWeak ] ---

	/** JNI method for {@link #objc_loadWeak} */
	@JavadocExclude
	public static native long nobjc_loadWeak(long location);

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

	/** JNI method for {@link #objc_storeWeak} */
	@JavadocExclude
	public static native long nobjc_storeWeak(long location, long obj);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobjc_storeWeak(memAddress(location), obj);
	}

	/** Alternative version of: {@link #objc_storeWeak} */
	public static long objc_storeWeak(PointerBuffer location, long obj) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return nobjc_storeWeak(memAddress(location), obj);
	}

	// --- [ objc_setAssociatedObject ] ---

	/** JNI method for {@link #objc_setAssociatedObject} */
	@JavadocExclude
	public static native void nobjc_setAssociatedObject(long object, long key, long value, long policy);

	/**
	 * Sets an associated value for a given object using a given key and association policy.
	 *
	 * @param object the source object for the association
	 * @param key    the key for the association
	 * @param value  the value to associate with the key {@code key} for {@code object}. Pass {@link #nil} to clear an existing association.
	 * @param policy the policy for the association. One of:<br>{@link #OBJC_ASSOCIATION_ASSIGN}, {@link #OBJC_ASSOCIATION_RETAIN_NONATOMIC}, {@link #OBJC_ASSOCIATION_COPY_NONATOMIC}, {@link #OBJC_ASSOCIATION_RETAIN}, {@link #OBJC_ASSOCIATION_COPY}
	 */
	public static void objc_setAssociatedObject(long object, long key, long value, long policy) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(object);
			checkPointer(key);
			checkPointer(value);
		}
		nobjc_setAssociatedObject(object, key, value, policy);
	}

	// --- [ objc_getAssociatedObject ] ---

	/** JNI method for {@link #objc_getAssociatedObject} */
	@JavadocExclude
	public static native long nobjc_getAssociatedObject(long object, long key);

	/**
	 * Returns the value associated with a given object for a given key.
	 *
	 * @param object the source object for the association
	 * @param key    the key for the association
	 *
	 * @return the value associated with the key {@code key} for {@code object}.
	 */
	public static long objc_getAssociatedObject(long object, long key) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(object);
			checkPointer(key);
		}
		return nobjc_getAssociatedObject(object, key);
	}

	// --- [ objc_removeAssociatedObjects ] ---

	/** JNI method for {@link #objc_removeAssociatedObjects} */
	@JavadocExclude
	public static native void nobjc_removeAssociatedObjects(long object);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(object);
		nobjc_removeAssociatedObjects(object);
	}

     /**
	 * Creates a {@link EnumerationMutationHandler} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EnumerationMutationHandler} instance
	 */
	public static EnumerationMutationHandler EnumerationMutationHandler(final EnumerationMutationHandler.SAM sam) {
		return new EnumerationMutationHandler() {
			@Override
			public void invoke(long id) {
				sam.invoke(id);
			}
		};
	}

}