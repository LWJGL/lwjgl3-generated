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

/** Contains information about a libffi call interface. */
public final class FFICIF implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ABI,
		NARGS,
		ARG_TYPES,
		RTYPE,
		BYTES,
		FLAGS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		ABI = offsets.get(0);
		NARGS = offsets.get(1);
		ARG_TYPES = offsets.get(2);
		RTYPE = offsets.get(3);
		BYTES = offsets.get(4);
		FLAGS = offsets.get(5);
	}

	private final ByteBuffer struct;

	public FFICIF() {
		this(malloc());
	}

	public FFICIF(ByteBuffer struct) {
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

	public void setAbi(int abi) { abi(struct, abi); }
	public void setNargs(int nargs) { nargs(struct, nargs); }
	public void setArgTypes(long arg_types) { arg_types(struct, arg_types); }
	public void setArgTypes(ByteBuffer arg_types) { arg_types(struct, arg_types); }
	public void setRtype(long rtype) { rtype(struct, rtype); }
	public void setBytes(int bytes) { bytes(struct, bytes); }
	public void setFlags(int flags) { flags(struct, flags); }

	public int getAbi() { return abi(struct); }
	public int getNargs() { return nargs(struct); }
	public long getArgTypes() { return arg_types(struct); }
	public ByteBuffer getArgTypes(int byteLen) { return arg_types(struct, byteLen); }
	public long getRtype() { return rtype(struct); }
	public int getBytes() { return bytes(struct); }
	public int getFlags() { return flags(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int abi,
		int nargs,
		ByteBuffer arg_types,
		long rtype,
		int bytes,
		int flags
	) {
		ByteBuffer ffi_cif = malloc();

		abi(ffi_cif, abi);
		nargs(ffi_cif, nargs);
		arg_types(ffi_cif, arg_types);
		rtype(ffi_cif, rtype);
		bytes(ffi_cif, bytes);
		flags(ffi_cif, flags);

		return ffi_cif;
	}

	public static void abi(ByteBuffer ffi_cif, int abi) { ffi_cif.putInt(ffi_cif.position() + ABI, abi); }
	public static void nargs(ByteBuffer ffi_cif, int nargs) { ffi_cif.putInt(ffi_cif.position() + NARGS, nargs); }
	public static void arg_types(ByteBuffer ffi_cif, long arg_types) { PointerBuffer.put(ffi_cif, ffi_cif.position() + ARG_TYPES, arg_types); }
	public static void arg_types(ByteBuffer ffi_cif, ByteBuffer arg_types) { arg_types(ffi_cif, memAddressSafe(arg_types)); }
	public static void rtype(ByteBuffer ffi_cif, long rtype) { PointerBuffer.put(ffi_cif, ffi_cif.position() + RTYPE, rtype); }
	public static void bytes(ByteBuffer ffi_cif, int bytes) { ffi_cif.putInt(ffi_cif.position() + BYTES, bytes); }
	public static void flags(ByteBuffer ffi_cif, int flags) { ffi_cif.putInt(ffi_cif.position() + FLAGS, flags); }

	public static int abi(ByteBuffer ffi_cif) { return ffi_cif.getInt(ffi_cif.position() + ABI); }
	public static int nargs(ByteBuffer ffi_cif) { return ffi_cif.getInt(ffi_cif.position() + NARGS); }
	public static long arg_types(ByteBuffer ffi_cif) { return PointerBuffer.get(ffi_cif, ffi_cif.position() + ARG_TYPES); }
	public static ByteBuffer arg_types(ByteBuffer ffi_cif, int byteLen) { return memByteBuffer(arg_types(ffi_cif), byteLen); }
	public static long rtype(ByteBuffer ffi_cif) { return PointerBuffer.get(ffi_cif, ffi_cif.position() + RTYPE); }
	public static int bytes(ByteBuffer ffi_cif) { return ffi_cif.getInt(ffi_cif.position() + BYTES); }
	public static int flags(ByteBuffer ffi_cif) { return ffi_cif.getInt(ffi_cif.position() + FLAGS); }

}