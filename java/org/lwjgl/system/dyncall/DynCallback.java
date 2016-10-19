/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.dyncall;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to \"dyncall_callback.h\".
 * 
 * <p>The dyncallback dyncall library has an interface to create callback  objects, that can be passed to functions as callback arguments. In other words, a
 * pointer to the callback object can be "called", directly. The callback handler then allows iterating dynamically over the arguments once called back.</p>
 */
public class DynCallback {

	/** Callback signatures. */
	public static final char
		DCB_SIGCHAR_CC_PREFIX       = '_',
		DCB_SIGCHAR_CC_ELLIPSIS     = 'e',
		DCB_SIGCHAR_CC_STDCALL      = 's',
		DCB_SIGCHAR_CC_FASTCALL_GNU = 'f',
		DCB_SIGCHAR_CC_FASTCALL_MS  = 'F',
		DCB_SIGCHAR_CC_THISCALL_MS  = '+';

	static { Library.initialize(); }

	protected DynCallback() {
		throw new UnsupportedOperationException();
	}

	// --- [ dcbNewCallback ] ---

	/** Unsafe version of: {@link #dcbNewCallback NewCallback} */
	public static native long ndcbNewCallback(long signature, long funcptr, long userdata);

	/**
	 * Creates and initializes a new {@code Callback} object.
	 * 
	 * <p>Use {@link #dcbFreeCallback FreeCallback} to destroy the {@code Callback} object.</p>
	 *
	 * @param signature the function signature of the function to mimic
	 * @param funcptr   a pointer to a callback handler
	 * @param userdata  a pointer to custom data that might be useful in the handler
	 */
	public static long dcbNewCallback(ByteBuffer signature, long funcptr, long userdata) {
		if ( CHECKS ) {
			checkNT1(signature);
			checkPointer(funcptr);
			checkPointer(userdata);
		}
		return ndcbNewCallback(memAddress(signature), funcptr, userdata);
	}

	/**
	 * Creates and initializes a new {@code Callback} object.
	 * 
	 * <p>Use {@link #dcbFreeCallback FreeCallback} to destroy the {@code Callback} object.</p>
	 *
	 * @param signature the function signature of the function to mimic
	 * @param funcptr   a pointer to a callback handler
	 * @param userdata  a pointer to custom data that might be useful in the handler
	 */
	public static long dcbNewCallback(CharSequence signature, long funcptr, long userdata) {
		if ( CHECKS ) {
			checkPointer(funcptr);
			checkPointer(userdata);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer signatureEncoded = stack.ASCII(signature);
			return ndcbNewCallback(memAddress(signatureEncoded), funcptr, userdata);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ dcbInitCallback ] ---

	/** Unsafe version of: {@link #dcbInitCallback InitCallback} */
	public static native void ndcbInitCallback(long pcb, long signature, long handler, long userdata);

	/**
	 * (Re)initializes a callback object.
	 *
	 * @param pcb       the callback object
	 * @param signature 
	 * @param handler   
	 * @param userdata  
	 */
	public static void dcbInitCallback(long pcb, ByteBuffer signature, long handler, ByteBuffer userdata) {
		if ( CHECKS ) {
			checkPointer(pcb);
			checkPointer(handler);
		}
		ndcbInitCallback(pcb, memAddress(signature), handler, memAddress(userdata));
	}

	// --- [ dcbFreeCallback ] ---

	/** Unsafe version of: {@link #dcbFreeCallback FreeCallback} */
	public static native void ndcbFreeCallback(long pcb);

	/**
	 * Destroys and frees the callback object.
	 *
	 * @param pcb the callback object
	 */
	public static void dcbFreeCallback(long pcb) {
		if ( CHECKS )
			checkPointer(pcb);
		ndcbFreeCallback(pcb);
	}

	// --- [ dcbGetUserData ] ---

	/** Unsafe version of: {@link #dcbGetUserData GetUserData} */
	public static native long ndcbGetUserData(long pcb);

	/**
	 * Returns a pointer to the {@code userdata} passed to the callback object on creation or initialization.
	 *
	 * @param pcb the callback object
	 */
	public static long dcbGetUserData(long pcb) {
		if ( CHECKS )
			checkPointer(pcb);
		return ndcbGetUserData(pcb);
	}

	// --- [ dcbArgBool ] ---

	/** Unsafe version of: {@link #dcbArgBool ArgBool} */
	public static native int ndcbArgBool(long args);

	/**
	 * Returns the next {@code bool} argument.
	 *
	 * @param args the function arguments
	 */
	public static int dcbArgBool(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgBool(args);
	}

	// --- [ dcbArgChar ] ---

	/** Unsafe version of: {@link #dcbArgChar ArgChar} */
	public static native byte ndcbArgChar(long args);

	/**
	 * Returns the next {@code char} argument.
	 *
	 * @param args the function arguments
	 */
	public static byte dcbArgChar(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgChar(args);
	}

	// --- [ dcbArgShort ] ---

	/** Unsafe version of: {@link #dcbArgShort ArgShort} */
	public static native short ndcbArgShort(long args);

	/**
	 * Returns the next {@code short} argument.
	 *
	 * @param args the function arguments
	 */
	public static short dcbArgShort(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgShort(args);
	}

	// --- [ dcbArgInt ] ---

	/** Unsafe version of: {@link #dcbArgInt ArgInt} */
	public static native int ndcbArgInt(long args);

	/**
	 * Returns the next {@code int} argument.
	 *
	 * @param args the function arguments
	 */
	public static int dcbArgInt(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgInt(args);
	}

	// --- [ dcbArgLong ] ---

	/** Unsafe version of: {@link #dcbArgLong ArgLong} */
	public static native int ndcbArgLong(long args);

	/**
	 * Returns the next {@code long} argument.
	 *
	 * @param args the function arguments
	 */
	public static int dcbArgLong(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgLong(args);
	}

	// --- [ dcbArgLongLong ] ---

	/** Unsafe version of: {@link #dcbArgLongLong ArgLongLong} */
	public static native long ndcbArgLongLong(long args);

	/**
	 * Returns the next {@code long long} argument.
	 *
	 * @param args the function arguments
	 */
	public static long dcbArgLongLong(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgLongLong(args);
	}

	// --- [ dcbArgUChar ] ---

	/** Unsafe version of: {@link #dcbArgUChar ArgUChar} */
	public static native byte ndcbArgUChar(long args);

	/**
	 * Returns the next {@code unsigned char} argument.
	 *
	 * @param args the function arguments
	 */
	public static byte dcbArgUChar(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgUChar(args);
	}

	// --- [ dcbArgUShort ] ---

	/** Unsafe version of: {@link #dcbArgUShort ArgUShort} */
	public static native short ndcbArgUShort(long args);

	/**
	 * Returns the next {@code unsigned short} argument.
	 *
	 * @param args the function arguments
	 */
	public static short dcbArgUShort(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgUShort(args);
	}

	// --- [ dcbArgUInt ] ---

	/** Unsafe version of: {@link #dcbArgUInt ArgUInt} */
	public static native int ndcbArgUInt(long args);

	/**
	 * Returns the next {@code unsigned int} argument.
	 *
	 * @param args the function arguments
	 */
	public static int dcbArgUInt(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgUInt(args);
	}

	// --- [ dcbArgULong ] ---

	/** Unsafe version of: {@link #dcbArgULong ArgULong} */
	public static native int ndcbArgULong(long args);

	/**
	 * Returns the next {@code unsigned long} argument.
	 *
	 * @param args the function arguments
	 */
	public static int dcbArgULong(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgULong(args);
	}

	// --- [ dcbArgULongLong ] ---

	/** Unsafe version of: {@link #dcbArgULongLong ArgULongLong} */
	public static native long ndcbArgULongLong(long args);

	/**
	 * Returns the next {@code unsigned long long} argument.
	 *
	 * @param args the function arguments
	 */
	public static long dcbArgULongLong(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgULongLong(args);
	}

	// --- [ dcbArgFloat ] ---

	/** Unsafe version of: {@link #dcbArgFloat ArgFloat} */
	public static native float ndcbArgFloat(long args);

	/**
	 * Returns the next {@code float} argument.
	 *
	 * @param args the function arguments
	 */
	public static float dcbArgFloat(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgFloat(args);
	}

	// --- [ dcbArgDouble ] ---

	/** Unsafe version of: {@link #dcbArgDouble ArgDouble} */
	public static native double ndcbArgDouble(long args);

	/**
	 * Returns the next {@code double} argument.
	 *
	 * @param args the function arguments
	 */
	public static double dcbArgDouble(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgDouble(args);
	}

	// --- [ dcbArgPointer ] ---

	/** Unsafe version of: {@link #dcbArgPointer ArgPointer} */
	public static native long ndcbArgPointer(long args);

	/**
	 * Returns the next {@code pointer} argument.
	 *
	 * @param args the function arguments
	 */
	public static long dcbArgPointer(long args) {
		if ( CHECKS )
			checkPointer(args);
		return ndcbArgPointer(args);
	}

}