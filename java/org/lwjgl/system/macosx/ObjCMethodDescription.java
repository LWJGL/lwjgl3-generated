/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines a method. */
public final class ObjCMethodDescription implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		TYPES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		NAME = offsets.get(0);
		TYPES = offsets.get(1);
	}

	private final ByteBuffer struct;

	public ObjCMethodDescription() {
		this(malloc());
	}

	public ObjCMethodDescription(ByteBuffer struct) {
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

	public void setName(long name) { name(struct, name); }
	public void setTypes(long types) { types(struct, types); }
	public void setTypes(ByteBuffer types) { types(struct, types); }

	public long getName() { return name(struct); }
	public long getTypes() { return types(struct); }
	public ByteBuffer getTypesBuffer() { return typesBuffer(struct); }
	public String getTypesString() { return typesString(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long name,
		ByteBuffer types
	) {
		ByteBuffer objc_method_description = malloc();

		name(objc_method_description, name);
		types(objc_method_description, types);

		return objc_method_description;
	}

	public static void name(ByteBuffer objc_method_description, long name) { PointerBuffer.put(objc_method_description, objc_method_description.position() + NAME, name); }
	public static void types(ByteBuffer objc_method_description, long types) { PointerBuffer.put(objc_method_description, objc_method_description.position() + TYPES, types); }
	public static void types(ByteBuffer objc_method_description, ByteBuffer types) { if ( LWJGLUtil.CHECKS && types != null ) checkNT1(types); types(objc_method_description, memAddressSafe(types)); }

	public static long name(ByteBuffer objc_method_description) { return PointerBuffer.get(objc_method_description, objc_method_description.position() + NAME); }
	public static long types(ByteBuffer objc_method_description) { return PointerBuffer.get(objc_method_description, objc_method_description.position() + TYPES); }
	public static ByteBuffer typesBuffer(ByteBuffer objc_method_description) { return memByteBufferNT1(types(objc_method_description)); }
	public static String typesString(ByteBuffer objc_method_description) { return memDecodeUTF8(types(objc_method_description)); }

}