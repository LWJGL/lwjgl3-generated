/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A libffi closure. This is an opaque data structure. */
public final class ffi_closure {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CIF,
		FUN,
		USER_DATA;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		CIF = offsets.get(0);
		FUN = offsets.get(1);
		USER_DATA = offsets.get(2);
	}

	private ffi_closure() {}

	private static native int offsets(long buffer);
	public static void cif(ByteBuffer ffi_closure, long cif) { PointerBuffer.put(ffi_closure, ffi_closure.position() + CIF, cif); }
	public static void cif(ByteBuffer ffi_closure, ByteBuffer cif) { cif(ffi_closure, memAddress(cif)); }
	public static void fun(ByteBuffer ffi_closure, long fun) { PointerBuffer.put(ffi_closure, ffi_closure.position() + FUN, fun); }
	public static void user_data(ByteBuffer ffi_closure, long user_data) { PointerBuffer.put(ffi_closure, ffi_closure.position() + USER_DATA, user_data); }

	public static long cif(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + CIF); }
	public static ByteBuffer cifb(ByteBuffer ffi_closure) { return memByteBuffer(cif(ffi_closure), ffi_cif.SIZEOF); }
	public static long fun(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + FUN); }
	public static long user_data(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + USER_DATA); }

}