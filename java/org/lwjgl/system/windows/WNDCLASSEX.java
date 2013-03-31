/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains the window class attributes that are registered by the {@link WinUser#RegisterClassEx} function. */
public final class WNDCLASSEX {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		STYLE,
		WNDPROC,
		CLSEXTRA,
		WNDEXTRA,
		INSTANCE,
		ICON,
		CURSOR,
		BACKGROUND,
		MENUNAME,
		CLASSNAME,
		ICONSM;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(12);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		STYLE = offsets.get(1);
		WNDPROC = offsets.get(2);
		CLSEXTRA = offsets.get(3);
		WNDEXTRA = offsets.get(4);
		INSTANCE = offsets.get(5);
		ICON = offsets.get(6);
		CURSOR = offsets.get(7);
		BACKGROUND = offsets.get(8);
		MENUNAME = offsets.get(9);
		CLASSNAME = offsets.get(10);
		ICONSM = offsets.get(11);
	}

	private WNDCLASSEX() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int size,
		int style,
		long wndProc,
		int clsExtra,
		int wndExtra,
		long instance,
		long icon,
		long cursor,
		long background,
		long menuName,
		long className,
		long iconSm
	) {
		ByteBuffer struct = malloc();

		sizeSet(struct, size);
		styleSet(struct, style);
		wndProcSet(struct, wndProc);
		clsExtraSet(struct, clsExtra);
		wndExtraSet(struct, wndExtra);
		instanceSet(struct, instance);
		iconSet(struct, icon);
		cursorSet(struct, cursor);
		backgroundSet(struct, background);
		menuNameSet(struct, menuName);
		classNameSet(struct, className);
		iconSmSet(struct, iconSm);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int size,
		int style,
		long wndProc,
		int clsExtra,
		int wndExtra,
		long instance,
		long icon,
		long cursor,
		long background,
		ByteBuffer menuName,
		ByteBuffer className,
		long iconSm
	) {
		ByteBuffer struct = malloc();

		sizeSet(struct, size);
		styleSet(struct, style);
		wndProcSet(struct, wndProc);
		clsExtraSet(struct, clsExtra);
		wndExtraSet(struct, wndExtra);
		instanceSet(struct, instance);
		iconSet(struct, icon);
		cursorSet(struct, cursor);
		backgroundSet(struct, background);
		menuNameSet(struct, menuName);
		classNameSet(struct, className);
		iconSmSet(struct, iconSm);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int size,
		int style,
		long wndProc,
		int clsExtra,
		int wndExtra,
		long instance,
		long icon,
		long cursor,
		long background,
		CharSequence menuName,
		CharSequence className,
		long iconSm
	) {
		ByteBuffer struct = malloc();

		sizeSet(struct, size);
		styleSet(struct, style);
		wndProcSet(struct, wndProc);
		clsExtraSet(struct, clsExtra);
		wndExtraSet(struct, wndExtra);
		instanceSet(struct, instance);
		iconSet(struct, icon);
		cursorSet(struct, cursor);
		backgroundSet(struct, background);
		menuNameSet(struct, menuName);
		classNameSet(struct, className);
		iconSmSet(struct, iconSm);

		return struct;
	}

	public static void sizeSet(ByteBuffer struct, int size) { struct.putInt(struct.position() + SIZE, size); }
	public static void styleSet(ByteBuffer struct, int style) { struct.putInt(struct.position() + STYLE, style); }
	public static void wndProcSet(ByteBuffer struct, long wndProc) { PointerBuffer.put(struct, struct.position() + WNDPROC, wndProc); }
	public static void clsExtraSet(ByteBuffer struct, int clsExtra) { struct.putInt(struct.position() + CLSEXTRA, clsExtra); }
	public static void wndExtraSet(ByteBuffer struct, int wndExtra) { struct.putInt(struct.position() + WNDEXTRA, wndExtra); }
	public static void instanceSet(ByteBuffer struct, long instance) { PointerBuffer.put(struct, struct.position() + INSTANCE, instance); }
	public static void iconSet(ByteBuffer struct, long icon) { PointerBuffer.put(struct, struct.position() + ICON, icon); }
	public static void cursorSet(ByteBuffer struct, long cursor) { PointerBuffer.put(struct, struct.position() + CURSOR, cursor); }
	public static void backgroundSet(ByteBuffer struct, long background) { PointerBuffer.put(struct, struct.position() + BACKGROUND, background); }
	public static void menuNameSet(ByteBuffer struct, long menuName) { PointerBuffer.put(struct, struct.position() + MENUNAME, menuName); }
	public static void menuNameSet(ByteBuffer struct, ByteBuffer menuName) { menuNameSet(struct, menuName == null ? 0 : memAddress(checkNT2(menuName))); }
	public static void menuNameSet(ByteBuffer struct, CharSequence menuName) { menuNameSet(struct, menuName == null ? 0 : memAddress(memEncodeUTF16(menuName))); }
	public static void classNameSet(ByteBuffer struct, long className) { PointerBuffer.put(struct, struct.position() + CLASSNAME, className); }
	public static void classNameSet(ByteBuffer struct, ByteBuffer className) { classNameSet(struct, className == null ? 0 : memAddress(checkNT2(className))); }
	public static void classNameSet(ByteBuffer struct, CharSequence className) { classNameSet(struct, className == null ? 0 : memAddress(memEncodeUTF16(className))); }
	public static void iconSmSet(ByteBuffer struct, long iconSm) { PointerBuffer.put(struct, struct.position() + ICONSM, iconSm); }

	public static int sizeGet(ByteBuffer struct) { return struct.getInt(struct.position() + SIZE); }
	public static int styleGet(ByteBuffer struct) { return struct.getInt(struct.position() + STYLE); }
	public static long wndProcGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + WNDPROC); }
	public static int clsExtraGet(ByteBuffer struct) { return struct.getInt(struct.position() + CLSEXTRA); }
	public static int wndExtraGet(ByteBuffer struct) { return struct.getInt(struct.position() + WNDEXTRA); }
	public static long instanceGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + INSTANCE); }
	public static long iconGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + ICON); }
	public static long cursorGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + CURSOR); }
	public static long backgroundGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + BACKGROUND); }
	public static long menuNameGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + MENUNAME); }
	public static ByteBuffer menuNameGetb(ByteBuffer struct) { long address = menuNameGet(struct); return address == 0 ? null : memByteBufferNT2(address); }
	public static String menuNameGets(ByteBuffer struct) { long address = menuNameGet(struct); return address == 0 ? null : memDecodeUTF16(memByteBufferNT2(address)); }
	public static long classNameGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + CLASSNAME); }
	public static ByteBuffer classNameGetb(ByteBuffer struct) { long address = classNameGet(struct); return address == 0 ? null : memByteBufferNT2(address); }
	public static String classNameGets(ByteBuffer struct) { long address = classNameGet(struct); return address == 0 ? null : memDecodeUTF16(memByteBufferNT2(address)); }
	public static long iconSmGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + ICONSM); }

}