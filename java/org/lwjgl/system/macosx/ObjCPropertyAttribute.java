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

/** Defines a property attribute. */
public final class ObjCPropertyAttribute implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		VALUE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		NAME = offsets.get(0);
		VALUE = offsets.get(1);
	}

	private final ByteBuffer struct;

	public ObjCPropertyAttribute() {
		this(malloc());
	}

	public ObjCPropertyAttribute(ByteBuffer struct) {
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
	public void setName(ByteBuffer name) { name(struct, name); }
	public void setValue(long value) { value(struct, value); }
	public void setValue(ByteBuffer value) { value(struct, value); }

	public long getName() { return name(struct); }
	public ByteBuffer getNameBuffer() { return nameBuffer(struct); }
	public String getNameString() { return nameString(struct); }
	public long getValue() { return value(struct); }
	public ByteBuffer getValueBuffer() { return valueBuffer(struct); }
	public String getValueString() { return valueString(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer name,
		ByteBuffer value
	) {
		ByteBuffer objc_property_attribute_t = malloc();

		name(objc_property_attribute_t, name);
		value(objc_property_attribute_t, value);

		return objc_property_attribute_t;
	}

	public static void name(ByteBuffer objc_property_attribute_t, long name) { PointerBuffer.put(objc_property_attribute_t, objc_property_attribute_t.position() + NAME, name); }
	public static void name(ByteBuffer objc_property_attribute_t, ByteBuffer name) { if ( LWJGLUtil.CHECKS && name != null ) checkNT1(name); name(objc_property_attribute_t, memAddressSafe(name)); }
	public static void value(ByteBuffer objc_property_attribute_t, long value) { PointerBuffer.put(objc_property_attribute_t, objc_property_attribute_t.position() + VALUE, value); }
	public static void value(ByteBuffer objc_property_attribute_t, ByteBuffer value) { if ( LWJGLUtil.CHECKS && value != null ) checkNT1(value); value(objc_property_attribute_t, memAddressSafe(value)); }

	public static long name(ByteBuffer objc_property_attribute_t) { return PointerBuffer.get(objc_property_attribute_t, objc_property_attribute_t.position() + NAME); }
	public static ByteBuffer nameBuffer(ByteBuffer objc_property_attribute_t) { return memByteBufferNT1(name(objc_property_attribute_t)); }
	public static String nameString(ByteBuffer objc_property_attribute_t) { return memDecodeUTF8(name(objc_property_attribute_t)); }
	public static long value(ByteBuffer objc_property_attribute_t) { return PointerBuffer.get(objc_property_attribute_t, objc_property_attribute_t.position() + VALUE); }
	public static ByteBuffer valueBuffer(ByteBuffer objc_property_attribute_t) { return memByteBufferNT1(value(objc_property_attribute_t)); }
	public static String valueString(ByteBuffer objc_property_attribute_t) { return memDecodeUTF8(value(objc_property_attribute_t)); }

}