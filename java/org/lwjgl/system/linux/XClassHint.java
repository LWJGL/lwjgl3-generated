/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Used by {@link Xlib#XSetClassHint}. */
public final class XClassHint {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RES_NAME,
		RES_CLASS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		RES_NAME = offsets.get(0);
		RES_CLASS = offsets.get(1);
	}

	private XClassHint() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long res_name,
		long res_class
	) {
		ByteBuffer xclasshint = malloc();

		res_name(xclasshint, res_name);
		res_class(xclasshint, res_class);

		return xclasshint;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer res_name,
		ByteBuffer res_class
	) {
		ByteBuffer xclasshint = malloc();

		res_nameSet(xclasshint, res_name);
		res_classSet(xclasshint, res_class);

		return xclasshint;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		CharSequence res_name,
		CharSequence res_class
	) {
		ByteBuffer xclasshint = malloc();

		res_nameSet(xclasshint, res_name);
		res_classSet(xclasshint, res_class);

		return xclasshint;
	}

	public static void res_name(ByteBuffer xclasshint, long res_name) { PointerBuffer.put(xclasshint, xclasshint.position() + RES_NAME, res_name); }
	public static void res_nameSet(ByteBuffer xclasshint, ByteBuffer res_name) { res_name(xclasshint, res_name == null ? NULL : memAddress(checkNT1(res_name))); }
	public static void res_nameSet(ByteBuffer xclasshint, CharSequence res_name) { ByteBuffer res_nameEncoded; res_name(xclasshint, res_name == null ? NULL : memAddress(res_nameEncoded = memEncodeASCII(res_name))); }
	public static void res_class(ByteBuffer xclasshint, long res_class) { PointerBuffer.put(xclasshint, xclasshint.position() + RES_CLASS, res_class); }
	public static void res_classSet(ByteBuffer xclasshint, ByteBuffer res_class) { res_class(xclasshint, res_class == null ? NULL : memAddress(checkNT1(res_class))); }
	public static void res_classSet(ByteBuffer xclasshint, CharSequence res_class) { ByteBuffer res_classEncoded; res_class(xclasshint, res_class == null ? NULL : memAddress(res_classEncoded = memEncodeASCII(res_class))); }

	public static long res_name(ByteBuffer xclasshint) { return PointerBuffer.get(xclasshint, xclasshint.position() + RES_NAME); }
	public static ByteBuffer res_nameGetb(ByteBuffer xclasshint) { long address = res_name(xclasshint); return address == NULL ? null : memByteBufferNT1(address); }
	public static String res_nameGets(ByteBuffer xclasshint) { long address = res_name(xclasshint); return address == NULL ? null : memDecodeASCII(memByteBufferNT1(address)); }
	public static long res_class(ByteBuffer xclasshint) { return PointerBuffer.get(xclasshint, xclasshint.position() + RES_CLASS); }
	public static ByteBuffer res_classGetb(ByteBuffer xclasshint) { long address = res_class(xclasshint); return address == NULL ? null : memByteBufferNT1(address); }
	public static String res_classGets(ByteBuffer xclasshint) { long address = res_class(xclasshint); return address == NULL ? null : memDecodeASCII(memByteBufferNT1(address)); }

}