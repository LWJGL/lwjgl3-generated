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

/**
 * Information used by the visual utility routines to find desired visual type from the many visuals a display may support.
 * 
 * <h3>XVisualInfo members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>visual</td><td class="nw">Visual *</td><td></td></tr>
 * <tr><td>visualid</td><td class="nw">VisualID</td><td></td></tr>
 * <tr><td>screen</td><td class="nw">int</td><td></td></tr>
 * <tr><td>depth</td><td class="nw">int</td><td></td></tr>
 * <tr><td>class</td><td class="nw">int</td><td></td></tr>
 * <tr><td>red_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>green_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>blue_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>colormap_size</td><td class="nw">int</td><td></td></tr>
 * <tr><td>bits_per_rgb</td><td class="nw">int</td><td></td></tr>
 * </table>
 */
public class XVisualInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		VISUAL,
		VISUALID,
		SCREEN,
		DEPTH,
		CLASS,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		COLORMAP_SIZE,
		BITS_PER_RGB;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		VISUAL = layout.offsetof(0);
		VISUALID = layout.offsetof(1);
		SCREEN = layout.offsetof(2);
		DEPTH = layout.offsetof(3);
		CLASS = layout.offsetof(4);
		RED_MASK = layout.offsetof(5);
		GREEN_MASK = layout.offsetof(6);
		BLUE_MASK = layout.offsetof(7);
		COLORMAP_SIZE = layout.offsetof(8);
		BITS_PER_RGB = layout.offsetof(9);
	}

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

	/** Returns a {@link Visual} view of the struct pointed to by the {@code visual} field. */
	public Visual visual() { return nvisualStruct(address()); }
	/** Returns the value of the {@code visualid} field. */
	public long visualid() { return nvisualid(address()); }
	/** Returns the value of the {@code screen} field. */
	public int screen() { return nscreen(address()); }
	/** Returns the value of the {@code depth} field. */
	public int depth() { return ndepth(address()); }
	/** Returns the value of the {@code class$} field. */
	public int class$() { return nclass$(address()); }
	/** Returns the value of the {@code red_mask} field. */
	public long red_mask() { return nred_mask(address()); }
	/** Returns the value of the {@code green_mask} field. */
	public long green_mask() { return ngreen_mask(address()); }
	/** Returns the value of the {@code blue_mask} field. */
	public long blue_mask() { return nblue_mask(address()); }
	/** Returns the value of the {@code colormap_size} field. */
	public int colormap_size() { return ncolormap_size(address()); }
	/** Returns the value of the {@code bits_per_rgb} field. */
	public int bits_per_rgb() { return nbits_per_rgb(address()); }

	/** Sets the address of the specified {@link Visual} to the {@code visual} field. */
	public XVisualInfo visual(Visual value) { nvisual(address(), value); return this; }
	/** Sets the specified value to the {@code visualid} field. */
	public XVisualInfo visualid(long value) { nvisualid(address(), value); return this; }
	/** Sets the specified value to the {@code screen} field. */
	public XVisualInfo screen(int value) { nscreen(address(), value); return this; }
	/** Sets the specified value to the {@code depth} field. */
	public XVisualInfo depth(int value) { ndepth(address(), value); return this; }
	/** Sets the specified value to the {@code class} field. */
	public XVisualInfo class$(int value) { nclass$(address(), value); return this; }
	/** Sets the specified value to the {@code red_mask} field. */
	public XVisualInfo red_mask(long value) { nred_mask(address(), value); return this; }
	/** Sets the specified value to the {@code green_mask} field. */
	public XVisualInfo green_mask(long value) { ngreen_mask(address(), value); return this; }
	/** Sets the specified value to the {@code blue_mask} field. */
	public XVisualInfo blue_mask(long value) { nblue_mask(address(), value); return this; }
	/** Sets the specified value to the {@code colormap_size} field. */
	public XVisualInfo colormap_size(int value) { ncolormap_size(address(), value); return this; }
	/** Sets the specified value to the {@code bits_per_rgb} field. */
	public XVisualInfo bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public XVisualInfo set(
		Visual visual,
		long visualid,
		int screen,
		int depth,
		int class$,
		long red_mask,
		long green_mask,
		long blue_mask,
		int colormap_size,
		int bits_per_rgb
	) {
		visual(visual);
		visualid(visualid);
		screen(screen);
		depth(depth);
		class$(class$);
		red_mask(red_mask);
		green_mask(green_mask);
		blue_mask(blue_mask);
		colormap_size(colormap_size);
		bits_per_rgb(bits_per_rgb);

		return this;
	}

	/** Unsafe version of {@link #set(XVisualInfo) set}. */
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
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(XVisualInfo) set}. */
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

	/** Unsafe version of {@link #visual}. */
	public static Visual nvisualStruct(long struct) { return new Visual(memGetAddress(struct + XVisualInfo.VISUAL)); }
	/** Unsafe version of {@link #visualid}. */
	public static long nvisualid(long struct) { return memGetAddress(struct + XVisualInfo.VISUALID); }
	/** Unsafe version of {@link #screen}. */
	public static int nscreen(long struct) { return memGetInt(struct + XVisualInfo.SCREEN); }
	/** Unsafe version of {@link #depth}. */
	public static int ndepth(long struct) { return memGetInt(struct + XVisualInfo.DEPTH); }
	/** Unsafe version of {@link #class$}. */
	public static int nclass$(long struct) { return memGetInt(struct + XVisualInfo.CLASS); }
	/** Unsafe version of {@link #red_mask}. */
	public static long nred_mask(long struct) { return memGetAddress(struct + XVisualInfo.RED_MASK); }
	/** Unsafe version of {@link #green_mask}. */
	public static long ngreen_mask(long struct) { return memGetAddress(struct + XVisualInfo.GREEN_MASK); }
	/** Unsafe version of {@link #blue_mask}. */
	public static long nblue_mask(long struct) { return memGetAddress(struct + XVisualInfo.BLUE_MASK); }
	/** Unsafe version of {@link #colormap_size}. */
	public static int ncolormap_size(long struct) { return memGetInt(struct + XVisualInfo.COLORMAP_SIZE); }
	/** Unsafe version of {@link #bits_per_rgb}. */
	public static int nbits_per_rgb(long struct) { return memGetInt(struct + XVisualInfo.BITS_PER_RGB); }

	/** Unsafe version of {@link #visual(Visual) visual}. */
	public static void nvisual(long struct, Visual value) { memPutAddress(struct + XVisualInfo.VISUAL, value.address()); }
	/** Unsafe version of {@link #visualid(long) visualid}. */
	public static void nvisualid(long struct, long value) { memPutAddress(struct + XVisualInfo.VISUALID, value); }
	/** Unsafe version of {@link #screen(int) screen}. */
	public static void nscreen(long struct, int value) { memPutInt(struct + XVisualInfo.SCREEN, value); }
	/** Unsafe version of {@link #depth(int) depth}. */
	public static void ndepth(long struct, int value) { memPutInt(struct + XVisualInfo.DEPTH, value); }
	/** Unsafe version of {@link #class$(int) class$}. */
	public static void nclass$(long struct, int value) { memPutInt(struct + XVisualInfo.CLASS, value); }
	/** Unsafe version of {@link #red_mask(long) red_mask}. */
	public static void nred_mask(long struct, long value) { memPutAddress(struct + XVisualInfo.RED_MASK, value); }
	/** Unsafe version of {@link #green_mask(long) green_mask}. */
	public static void ngreen_mask(long struct, long value) { memPutAddress(struct + XVisualInfo.GREEN_MASK, value); }
	/** Unsafe version of {@link #blue_mask(long) blue_mask}. */
	public static void nblue_mask(long struct, long value) { memPutAddress(struct + XVisualInfo.BLUE_MASK, value); }
	/** Unsafe version of {@link #colormap_size(int) colormap_size}. */
	public static void ncolormap_size(long struct, int value) { memPutInt(struct + XVisualInfo.COLORMAP_SIZE, value); }
	/** Unsafe version of {@link #bits_per_rgb(int) bits_per_rgb}. */
	public static void nbits_per_rgb(long struct, int value) { memPutInt(struct + XVisualInfo.BITS_PER_RGB, value); }

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

		/** Returns a {@link Visual} view of the struct pointed to by the {@code visual} field. */
		public Visual visual() { return nvisualStruct(address()); }
		/** Returns the value of the {@code visualid} field. */
		public long visualid() { return nvisualid(address()); }
		/** Returns the value of the {@code screen} field. */
		public int screen() { return nscreen(address()); }
		/** Returns the value of the {@code depth} field. */
		public int depth() { return ndepth(address()); }
		/** Returns the value of the {@code class$} field. */
		public int class$() { return nclass$(address()); }
		/** Returns the value of the {@code red_mask} field. */
		public long red_mask() { return nred_mask(address()); }
		/** Returns the value of the {@code green_mask} field. */
		public long green_mask() { return ngreen_mask(address()); }
		/** Returns the value of the {@code blue_mask} field. */
		public long blue_mask() { return nblue_mask(address()); }
		/** Returns the value of the {@code colormap_size} field. */
		public int colormap_size() { return ncolormap_size(address()); }
		/** Returns the value of the {@code bits_per_rgb} field. */
		public int bits_per_rgb() { return nbits_per_rgb(address()); }

		/** Sets the address of the specified {@link Visual} to the {@code visual} field. */
		public XVisualInfo.Buffer visual(Visual value) { nvisual(address(), value); return this; }
		/** Sets the specified value to the {@code visualid} field. */
		public XVisualInfo.Buffer visualid(long value) { nvisualid(address(), value); return this; }
		/** Sets the specified value to the {@code screen} field. */
		public XVisualInfo.Buffer screen(int value) { nscreen(address(), value); return this; }
		/** Sets the specified value to the {@code depth} field. */
		public XVisualInfo.Buffer depth(int value) { ndepth(address(), value); return this; }
		/** Sets the specified value to the {@code class} field. */
		public XVisualInfo.Buffer class$(int value) { nclass$(address(), value); return this; }
		/** Sets the specified value to the {@code red_mask} field. */
		public XVisualInfo.Buffer red_mask(long value) { nred_mask(address(), value); return this; }
		/** Sets the specified value to the {@code green_mask} field. */
		public XVisualInfo.Buffer green_mask(long value) { ngreen_mask(address(), value); return this; }
		/** Sets the specified value to the {@code blue_mask} field. */
		public XVisualInfo.Buffer blue_mask(long value) { nblue_mask(address(), value); return this; }
		/** Sets the specified value to the {@code colormap_size} field. */
		public XVisualInfo.Buffer colormap_size(int value) { ncolormap_size(address(), value); return this; }
		/** Sets the specified value to the {@code bits_per_rgb} field. */
		public XVisualInfo.Buffer bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }

	}

}