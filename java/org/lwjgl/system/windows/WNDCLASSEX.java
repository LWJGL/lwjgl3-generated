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
public final class WNDCLASSEX implements Pointer {

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

	private final ByteBuffer struct;

	public WNDCLASSEX() {
		this(malloc());
	}

	public WNDCLASSEX(ByteBuffer struct) {
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

	public void setSize(int size) { size(struct, size); }
	public void setStyle(int style) { style(struct, style); }
	public void setWndProc(long wndProc) { wndProc(struct, wndProc); }
	public void setClsExtra(int clsExtra) { clsExtra(struct, clsExtra); }
	public void setWndExtra(int wndExtra) { wndExtra(struct, wndExtra); }
	public void setInstance(long instance) { instance(struct, instance); }
	public void setIcon(long icon) { icon(struct, icon); }
	public void setCursor(long cursor) { cursor(struct, cursor); }
	public void setBackground(long background) { background(struct, background); }
	public void setMenuName(long menuName) { menuName(struct, menuName); }
	public void setMenuName(ByteBuffer menuName) { menuName(struct, menuName); }
	public void setClassName(long className) { className(struct, className); }
	public void setClassName(ByteBuffer className) { className(struct, className); }
	public void setIconSm(long iconSm) { iconSm(struct, iconSm); }

	public int getSize() { return size(struct); }
	public int getStyle() { return style(struct); }
	public long getWndProc() { return wndProc(struct); }
	public int getClsExtra() { return clsExtra(struct); }
	public int getWndExtra() { return wndExtra(struct); }
	public long getInstance() { return instance(struct); }
	public long getIcon() { return icon(struct); }
	public long getCursor() { return cursor(struct); }
	public long getBackground() { return background(struct); }
	public long getMenuName() { return menuName(struct); }
	public ByteBuffer getMenuNameBuffer() { return menuNameBuffer(struct); }
	public String getMenuNameString() { return menuNameString(struct); }
	public long getClassName() { return className(struct); }
	public ByteBuffer getClassNameBuffer() { return classNameBuffer(struct); }
	public String getClassNameString() { return classNameString(struct); }
	public long getIconSm() { return iconSm(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		size(wndclassex, size);
		style(wndclassex, style);
		wndProc(wndclassex, wndProc);
		clsExtra(wndclassex, clsExtra);
		wndExtra(wndclassex, wndExtra);
		instance(wndclassex, instance);
		icon(wndclassex, icon);
		cursor(wndclassex, cursor);
		background(wndclassex, background);
		menuName(wndclassex, menuName);
		className(wndclassex, className);
		iconSm(wndclassex, iconSm);

		return wndclassex;
	}

	public static void size(ByteBuffer wndclassex, int size) { wndclassex.putInt(wndclassex.position() + SIZE, size); }
	public static void style(ByteBuffer wndclassex, int style) { wndclassex.putInt(wndclassex.position() + STYLE, style); }
	public static void wndProc(ByteBuffer wndclassex, long wndProc) { PointerBuffer.put(wndclassex, wndclassex.position() + WNDPROC, wndProc); }
	public static void clsExtra(ByteBuffer wndclassex, int clsExtra) { wndclassex.putInt(wndclassex.position() + CLSEXTRA, clsExtra); }
	public static void wndExtra(ByteBuffer wndclassex, int wndExtra) { wndclassex.putInt(wndclassex.position() + WNDEXTRA, wndExtra); }
	public static void instance(ByteBuffer wndclassex, long instance) { PointerBuffer.put(wndclassex, wndclassex.position() + INSTANCE, instance); }
	public static void icon(ByteBuffer wndclassex, long icon) { PointerBuffer.put(wndclassex, wndclassex.position() + ICON, icon); }
	public static void cursor(ByteBuffer wndclassex, long cursor) { PointerBuffer.put(wndclassex, wndclassex.position() + CURSOR, cursor); }
	public static void background(ByteBuffer wndclassex, long background) { PointerBuffer.put(wndclassex, wndclassex.position() + BACKGROUND, background); }
	public static void menuName(ByteBuffer wndclassex, long menuName) { PointerBuffer.put(wndclassex, wndclassex.position() + MENUNAME, menuName); }
	public static void menuName(ByteBuffer wndclassex, ByteBuffer menuName) { if ( LWJGLUtil.CHECKS && menuName != null ) checkNT2(menuName); menuName(wndclassex, memAddressSafe(menuName)); }
	public static void className(ByteBuffer wndclassex, long className) { PointerBuffer.put(wndclassex, wndclassex.position() + CLASSNAME, className); }
	public static void className(ByteBuffer wndclassex, ByteBuffer className) { if ( LWJGLUtil.CHECKS && className != null ) checkNT2(className); className(wndclassex, memAddressSafe(className)); }
	public static void iconSm(ByteBuffer wndclassex, long iconSm) { PointerBuffer.put(wndclassex, wndclassex.position() + ICONSM, iconSm); }

	public static int size(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + SIZE); }
	public static int style(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + STYLE); }
	public static long wndProc(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + WNDPROC); }
	public static int clsExtra(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + CLSEXTRA); }
	public static int wndExtra(ByteBuffer wndclassex) { return wndclassex.getInt(wndclassex.position() + WNDEXTRA); }
	public static long instance(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + INSTANCE); }
	public static long icon(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + ICON); }
	public static long cursor(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + CURSOR); }
	public static long background(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + BACKGROUND); }
	public static long menuName(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + MENUNAME); }
	public static ByteBuffer menuNameBuffer(ByteBuffer wndclassex) { return memByteBufferNT2(menuName(wndclassex)); }
	public static String menuNameString(ByteBuffer wndclassex) { return memDecodeUTF16(menuName(wndclassex)); }
	public static long className(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + CLASSNAME); }
	public static ByteBuffer classNameBuffer(ByteBuffer wndclassex) { return memByteBufferNT2(className(wndclassex)); }
	public static String classNameString(ByteBuffer wndclassex) { return memDecodeUTF16(className(wndclassex)); }
	public static long iconSm(ByteBuffer wndclassex) { return PointerBuffer.get(wndclassex, wndclassex.position() + ICONSM); }

}