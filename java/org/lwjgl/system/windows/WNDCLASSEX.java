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
		ByteBuffer wndclassex = malloc();

		sizeSet(wndclassex, size);
		styleSet(wndclassex, style);
		wndProcSet(wndclassex, wndProc);
		clsExtraSet(wndclassex, clsExtra);
		wndExtraSet(wndclassex, wndExtra);
		instanceSet(wndclassex, instance);
		iconSet(wndclassex, icon);
		cursorSet(wndclassex, cursor);
		backgroundSet(wndclassex, background);
		menuNameSet(wndclassex, menuName);
		classNameSet(wndclassex, className);
		iconSmSet(wndclassex, iconSm);

		return wndclassex;
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
		ByteBuffer wndclassex = malloc();

		sizeSet(wndclassex, size);
		styleSet(wndclassex, style);
		wndProcSet(wndclassex, wndProc);
		clsExtraSet(wndclassex, clsExtra);
		wndExtraSet(wndclassex, wndExtra);
		instanceSet(wndclassex, instance);
		iconSet(wndclassex, icon);
		cursorSet(wndclassex, cursor);
		backgroundSet(wndclassex, background);
		menuNameSet(wndclassex, menuName);
		classNameSet(wndclassex, className);
		iconSmSet(wndclassex, iconSm);

		return wndclassex;
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
		ByteBuffer wndclassex = malloc();

		sizeSet(wndclassex, size);
		styleSet(wndclassex, style);
		wndProcSet(wndclassex, wndProc);
		clsExtraSet(wndclassex, clsExtra);
		wndExtraSet(wndclassex, wndExtra);
		instanceSet(wndclassex, instance);
		iconSet(wndclassex, icon);
		cursorSet(wndclassex, cursor);
		backgroundSet(wndclassex, background);
		menuNameSet(wndclassex, menuName);
		classNameSet(wndclassex, className);
		iconSmSet(wndclassex, iconSm);

		return wndclassex;
	}

	public static void sizeSet(ByteBuffer wndclassex, int size) { wndclassex.putInt(wndclassex.position() + SIZE, size); }
	public static void styleSet(ByteBuffer wndclassex, int style) { wndclassex.putInt(wndclassex.position() + STYLE, style); }
	public static void wndProcSet(ByteBuffer wndclassex, long wndProc) { PointerBuffer.put(wndclassex, wndclassex.position() + WNDPROC, wndProc); }
	public static void clsExtraSet(ByteBuffer wndclassex, int clsExtra) { wndclassex.putInt(wndclassex.position() + CLSEXTRA, clsExtra); }
	public static void wndExtraSet(ByteBuffer wndclassex, int wndExtra) { wndclassex.putInt(wndclassex.position() + WNDEXTRA, wndExtra); }
	public static void instanceSet(ByteBuffer wndclassex, long instance) { PointerBuffer.put(wndclassex, wndclassex.position() + INSTANCE, instance); }
	public static void iconSet(ByteBuffer wndclassex, long icon) { PointerBuffer.put(wndclassex, wndclassex.position() + ICON, icon); }
	public static void cursorSet(ByteBuffer wndclassex, long cursor) { PointerBuffer.put(wndclassex, wndclassex.position() + CURSOR, cursor); }
	public static void backgroundSet(ByteBuffer wndclassex, long background) { PointerBuffer.put(wndclassex, wndclassex.position() + BACKGROUND, background); }
	public static void menuNameSet(ByteBuffer wndclassex, long menuName) { PointerBuffer.put(wndclassex, wndclassex.position() + MENUNAME, menuName); }
	public static void menuNameSet(ByteBuffer wndclassex, ByteBuffer menuName) { menuNameSet(wndclassex, menuName == null ? 0 : memAddress(checkNT2(menuName))); }
	public static void menuNameSet(ByteBuffer wndclassex, CharSequence menuName) { menuNameSet(wndclassex, menuName == null ? 0 : memAddress(memEncodeUTF16(menuName))); }
	public static void classNameSet(ByteBuffer wndclassex, long className) { PointerBuffer.put(wndclassex, wndclassex.position() + CLASSNAME, className); }
	public static void classNameSet(ByteBuffer wndclassex, ByteBuffer className) { classNameSet(wndclassex, className == null ? 0 : memAddress(checkNT2(className))); }
	public static void classNameSet(ByteBuffer wndclassex, CharSequence className) { classNameSet(wndclassex, className == null ? 0 : memAddress(memEncodeUTF16(className))); }
	public static void iconSmSet(ByteBuffer wndclassex, long iconSm) { PointerBuffer.put(wndclassex, wndclassex.position() + ICONSM, iconSm); }

	public static int sizeGet(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + SIZE); }
	public static int styleGet(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + STYLE); }
	public static long wndProcGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + WNDPROC); }
	public static int clsExtraGet(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + CLSEXTRA); }
	public static int wndExtraGet(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + WNDEXTRA); }
	public static long instanceGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + INSTANCE); }
	public static long iconGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + ICON); }
	public static long cursorGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + CURSOR); }
	public static long backgroundGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + BACKGROUND); }
	public static long menuNameGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + MENUNAME); }
	public static ByteBuffer menuNameGetb(ByteBuffer wndclassex) { long address = menuNameGet(wndclassex); return address == 0 ? null : memByteBufferNT2(address); }
	public static String menuNameGets(ByteBuffer wndclassex) { long address = menuNameGet(wndclassex); return address == 0 ? null : memDecodeUTF16(memByteBufferNT2(address)); }
	public static long classNameGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + CLASSNAME); }
	public static ByteBuffer classNameGetb(ByteBuffer wndclassex) { long address = classNameGet(wndclassex); return address == 0 ? null : memByteBufferNT2(address); }
	public static String classNameGets(ByteBuffer wndclassex) { long address = classNameGet(wndclassex); return address == 0 ? null : memDecodeUTF16(memByteBufferNT2(address)); }
	public static long iconSmGet(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + ICONSM); }

}