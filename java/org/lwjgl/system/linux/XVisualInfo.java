/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Information used by the visual utility routines to find desired visual type from the many visuals a display may support. */
public class XVisualInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		VISUAL,
		VISUALID,
		SCREEN,
		DEPTH,
		CLAZZ,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		COLORMAP_SIZE,
		BITS_PER_RGB;

	static {
		IntBuffer offsets = memAllocInt(10);

		SIZEOF = offsets(memAddress(offsets));

		VISUAL = offsets.get(0);
		VISUALID = offsets.get(1);
		SCREEN = offsets.get(2);
		DEPTH = offsets.get(3);
		CLAZZ = offsets.get(4);
		RED_MASK = offsets.get(5);
		GREEN_MASK = offsets.get(6);
		BLUE_MASK = offsets.get(7);
		COLORMAP_SIZE = offsets.get(8);
		BITS_PER_RGB = offsets.get(9);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	XVisualInfo(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link XVisualInfo} instance at the specified memory address. */
	public XVisualInfo(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link XVisualInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public XVisualInfo(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public Visual getVisual() { return ngetVisualStruct(address()); }
	public long getVisualid() { return ngetVisualid(address()); }
	public int getScreen() { return ngetScreen(address()); }
	public int getDepth() { return ngetDepth(address()); }
	public int getClazz() { return ngetClazz(address()); }
	public long getRedMask() { return ngetRedMask(address()); }
	public long getGreenMask() { return ngetGreenMask(address()); }
	public long getBlueMask() { return ngetBlueMask(address()); }
	public int getColormapSize() { return ngetColormapSize(address()); }
	public int getBitsPerRgb() { return ngetBitsPerRgb(address()); }

	public XVisualInfo setVisual(Visual visual) { nsetVisual(address(), visual); return this; }
	public XVisualInfo setVisualid(long visualid) { nsetVisualid(address(), visualid); return this; }
	public XVisualInfo setScreen(int screen) { nsetScreen(address(), screen); return this; }
	public XVisualInfo setDepth(int depth) { nsetDepth(address(), depth); return this; }
	public XVisualInfo setClazz(int clazz) { nsetClazz(address(), clazz); return this; }
	public XVisualInfo setRedMask(long red_mask) { nsetRedMask(address(), red_mask); return this; }
	public XVisualInfo setGreenMask(long green_mask) { nsetGreenMask(address(), green_mask); return this; }
	public XVisualInfo setBlueMask(long blue_mask) { nsetBlueMask(address(), blue_mask); return this; }
	public XVisualInfo setColormapSize(int colormap_size) { nsetColormapSize(address(), colormap_size); return this; }
	public XVisualInfo setBitsPerRgb(int bits_per_rgb) { nsetBitsPerRgb(address(), bits_per_rgb); return this; }

	/** Initializes this struct with the specified values. */
	public XVisualInfo set(
		Visual visual,
		long visualid,
		int screen,
		int depth,
		int clazz,
		long red_mask,
		long green_mask,
		long blue_mask,
		int colormap_size,
		int bits_per_rgb
	) {
		setVisual(visual);
		setVisualid(visualid);
		setScreen(screen);
		setDepth(depth);
		setClazz(clazz);
		setRedMask(red_mask);
		setGreenMask(green_mask);
		setBlueMask(blue_mask);
		setColormapSize(colormap_size);
		setBitsPerRgb(bits_per_rgb);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public XVisualInfo nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public XVisualInfo set(XVisualInfo src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public XVisualInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link XVisualInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static XVisualInfo malloc() {
		return new XVisualInfo(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link XVisualInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static XVisualInfo calloc() {
		return new XVisualInfo(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link XVisualInfo} instance allocated with {@link BufferUtils}. */
	public static XVisualInfo create() {
		return new XVisualInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link XVisualInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static long ngetVisual(long struct) { return memGetAddress(struct + VISUAL); }
	public static Visual ngetVisualStruct(long struct) { return new Visual(ngetVisual(struct)); }
	public static Visual getVisual(ByteBuffer struct) { return ngetVisualStruct(memAddress(struct)); }
	public static long ngetVisualid(long struct) { return memGetAddress(struct + VISUALID); }
	public static long getVisualid(ByteBuffer struct) { return ngetVisualid(memAddress(struct)); }
	public static int ngetScreen(long struct) { return memGetInt(struct + SCREEN); }
	public static int getScreen(ByteBuffer struct) { return ngetScreen(memAddress(struct)); }
	public static int ngetDepth(long struct) { return memGetInt(struct + DEPTH); }
	public static int getDepth(ByteBuffer struct) { return ngetDepth(memAddress(struct)); }
	public static int ngetClazz(long struct) { return memGetInt(struct + CLAZZ); }
	public static int getClazz(ByteBuffer struct) { return ngetClazz(memAddress(struct)); }
	public static long ngetRedMask(long struct) { return memGetAddress(struct + RED_MASK); }
	public static long getRedMask(ByteBuffer struct) { return ngetRedMask(memAddress(struct)); }
	public static long ngetGreenMask(long struct) { return memGetAddress(struct + GREEN_MASK); }
	public static long getGreenMask(ByteBuffer struct) { return ngetGreenMask(memAddress(struct)); }
	public static long ngetBlueMask(long struct) { return memGetAddress(struct + BLUE_MASK); }
	public static long getBlueMask(ByteBuffer struct) { return ngetBlueMask(memAddress(struct)); }
	public static int ngetColormapSize(long struct) { return memGetInt(struct + COLORMAP_SIZE); }
	public static int getColormapSize(ByteBuffer struct) { return ngetColormapSize(memAddress(struct)); }
	public static int ngetBitsPerRgb(long struct) { return memGetInt(struct + BITS_PER_RGB); }
	public static int getBitsPerRgb(ByteBuffer struct) { return ngetBitsPerRgb(memAddress(struct)); }

	public static void nsetVisual(long struct, long visual) { memPutAddress(struct + VISUAL, visual); }
	public static void nsetVisual(long struct, Visual visual) { nsetVisual(struct, visual.address()); }
	public static void setVisual(ByteBuffer struct, Visual visual) { nsetVisual(memAddress(struct), visual); }
	public static void nsetVisualid(long struct, long visualid) { memPutAddress(struct + VISUALID, visualid); }
	public static void setVisualid(ByteBuffer struct, long visualid) { nsetVisualid(memAddress(struct), visualid); }
	public static void nsetScreen(long struct, int screen) { memPutInt(struct + SCREEN, screen); }
	public static void setScreen(ByteBuffer struct, int screen) { nsetScreen(memAddress(struct), screen); }
	public static void nsetDepth(long struct, int depth) { memPutInt(struct + DEPTH, depth); }
	public static void setDepth(ByteBuffer struct, int depth) { nsetDepth(memAddress(struct), depth); }
	public static void nsetClazz(long struct, int clazz) { memPutInt(struct + CLAZZ, clazz); }
	public static void setClazz(ByteBuffer struct, int clazz) { nsetClazz(memAddress(struct), clazz); }
	public static void nsetRedMask(long struct, long red_mask) { memPutAddress(struct + RED_MASK, red_mask); }
	public static void setRedMask(ByteBuffer struct, long red_mask) { nsetRedMask(memAddress(struct), red_mask); }
	public static void nsetGreenMask(long struct, long green_mask) { memPutAddress(struct + GREEN_MASK, green_mask); }
	public static void setGreenMask(ByteBuffer struct, long green_mask) { nsetGreenMask(memAddress(struct), green_mask); }
	public static void nsetBlueMask(long struct, long blue_mask) { memPutAddress(struct + BLUE_MASK, blue_mask); }
	public static void setBlueMask(ByteBuffer struct, long blue_mask) { nsetBlueMask(memAddress(struct), blue_mask); }
	public static void nsetColormapSize(long struct, int colormap_size) { memPutInt(struct + COLORMAP_SIZE, colormap_size); }
	public static void setColormapSize(ByteBuffer struct, int colormap_size) { nsetColormapSize(memAddress(struct), colormap_size); }
	public static void nsetBitsPerRgb(long struct, int bits_per_rgb) { memPutInt(struct + BITS_PER_RGB, bits_per_rgb); }
	public static void setBitsPerRgb(ByteBuffer struct, int bits_per_rgb) { nsetBitsPerRgb(memAddress(struct), bits_per_rgb); }

	// -----------------------------------

	/** An array of {@link XVisualInfo} structs. */
	public static final class Buffer extends StructBuffer<XVisualInfo, Buffer> {

		/**
		 * Creates a new {@link XVisualInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link XVisualInfo#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected XVisualInfo newInstance(long address) {
			return new XVisualInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public Visual getVisual() { return ngetVisualStruct(address()); }
		public long getVisualid() { return ngetVisualid(address()); }
		public int getScreen() { return ngetScreen(address()); }
		public int getDepth() { return ngetDepth(address()); }
		public int getClazz() { return ngetClazz(address()); }
		public long getRedMask() { return ngetRedMask(address()); }
		public long getGreenMask() { return ngetGreenMask(address()); }
		public long getBlueMask() { return ngetBlueMask(address()); }
		public int getColormapSize() { return ngetColormapSize(address()); }
		public int getBitsPerRgb() { return ngetBitsPerRgb(address()); }

		public XVisualInfo.Buffer setVisual(Visual visual) { nsetVisual(address(), visual); return this; }
		public XVisualInfo.Buffer setVisualid(long visualid) { nsetVisualid(address(), visualid); return this; }
		public XVisualInfo.Buffer setScreen(int screen) { nsetScreen(address(), screen); return this; }
		public XVisualInfo.Buffer setDepth(int depth) { nsetDepth(address(), depth); return this; }
		public XVisualInfo.Buffer setClazz(int clazz) { nsetClazz(address(), clazz); return this; }
		public XVisualInfo.Buffer setRedMask(long red_mask) { nsetRedMask(address(), red_mask); return this; }
		public XVisualInfo.Buffer setGreenMask(long green_mask) { nsetGreenMask(address(), green_mask); return this; }
		public XVisualInfo.Buffer setBlueMask(long blue_mask) { nsetBlueMask(address(), blue_mask); return this; }
		public XVisualInfo.Buffer setColormapSize(int colormap_size) { nsetColormapSize(address(), colormap_size); return this; }
		public XVisualInfo.Buffer setBitsPerRgb(int bits_per_rgb) { nsetBitsPerRgb(address(), bits_per_rgb); return this; }

	}

}