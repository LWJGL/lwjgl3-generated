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

/** The libffi closure structure. */
public final class FFIClosure implements Pointer {

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

	private final ByteBuffer struct;

	public FFIClosure(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setCif(long cif) { cif(struct, cif); }
	public void setCif(ByteBuffer cif) { cif(struct, cif); }
	public void setFun(long fun) { fun(struct, fun); }
	public void setUserData(long user_data) { user_data(struct, user_data); }

	public long getCif() { return cif(struct); }
	public ByteBuffer getCifBuffer() { return cifBuffer(struct); }
	public long getFun() { return fun(struct); }
	public long getUserData() { return user_data(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);
	public static void cif(ByteBuffer ffi_closure, long cif) { PointerBuffer.put(ffi_closure, ffi_closure.position() + CIF, cif); }
	public static void cif(ByteBuffer ffi_closure, ByteBuffer cif) { cif(ffi_closure, memAddressSafe(cif)); }
	public static void fun(ByteBuffer ffi_closure, long fun) { PointerBuffer.put(ffi_closure, ffi_closure.position() + FUN, fun); }
	public static void user_data(ByteBuffer ffi_closure, long user_data) { PointerBuffer.put(ffi_closure, ffi_closure.position() + USER_DATA, user_data); }

	public static long cif(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + CIF); }
	public static ByteBuffer cifBuffer(ByteBuffer ffi_closure) { return memByteBuffer(cif(ffi_closure), FFICIF.SIZEOF); }
	public static long fun(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + FUN); }
	public static long user_data(ByteBuffer ffi_closure) { return PointerBuffer.get(ffi_closure, ffi_closure.position() + USER_DATA); }

}