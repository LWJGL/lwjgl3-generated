/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Provides information about the last error. */
public final class OVRErrorInfo implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RESULT,
		ERRORSTRING;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		RESULT = offsets.get(0);
		ERRORSTRING = offsets.get(1);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRErrorInfo() {
		this(malloc());
	}

	public OVRErrorInfo(ByteBuffer struct) {
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

	public OVRErrorInfo setResult(int Result) { Result(struct, Result); return this; }
	public OVRErrorInfo setErrorString(ByteBuffer ErrorString) { ErrorStringSet(struct, ErrorString); return this; }
	public OVRErrorInfo setErrorString(int index, byte ErrorString) { ErrorString(struct, index, ErrorString); return this; }

	public int getResult() { return Result(struct); }
	public void getErrorString(ByteBuffer ErrorString) { ErrorStringGet(struct, ErrorString); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Result,
		ByteBuffer ErrorString
	) {
		ByteBuffer ovrerrorinfo = malloc();

		Result(ovrerrorinfo, Result);
		ErrorStringSet(ovrerrorinfo, ErrorString);

		return ovrerrorinfo;
	}

	public static void Result(ByteBuffer ovrerrorinfo, int Result) { ovrerrorinfo.putInt(ovrerrorinfo.position() + RESULT, Result); }
	public static void ErrorStringSet(ByteBuffer ovrerrorinfo, ByteBuffer ErrorString) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(ErrorString, 512 * 1);
		}
		memCopy(memAddress(ErrorString), memAddress(ovrerrorinfo) + ERRORSTRING, ErrorString.remaining());
	}
	public static void ErrorString(ByteBuffer ovrerrorinfo, int index, byte ErrorString) { ovrerrorinfo.put(ERRORSTRING + index, ErrorString); }

	public static int Result(ByteBuffer ovrerrorinfo) { return ovrerrorinfo.getInt(ovrerrorinfo.position() + RESULT); }
	public static void ErrorStringGet(ByteBuffer ovrerrorinfo, ByteBuffer ErrorString) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ErrorString, 512 * 1);
		memCopy(memAddress(ovrerrorinfo) + ERRORSTRING, memAddress(ErrorString), ErrorString.remaining());
	}
	public static byte ErrorString(ByteBuffer ovrerrorinfo, int index) {
		return ovrerrorinfo.get(ERRORSTRING + index * 1);
	}

}