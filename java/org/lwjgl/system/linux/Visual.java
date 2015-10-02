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

/** Visual structure; contains information about colormapping possible. */
public class Visual extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		VISUALID,
		CLAZZ,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		BITS_PER_RGB,
		MAP_ENTRIES;

	static {
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		VISUALID = offsets.get(0);
		CLAZZ = offsets.get(1);
		RED_MASK = offsets.get(2);
		GREEN_MASK = offsets.get(3);
		BLUE_MASK = offsets.get(4);
		BITS_PER_RGB = offsets.get(5);
		MAP_ENTRIES = offsets.get(6);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	Visual(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link Visual} instance at the specified memory address. */
	public Visual(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link Visual} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public Visual(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getVisualid() { return ngetVisualid(address()); }
	public int getClazz() { return ngetClazz(address()); }
	public long getRedMask() { return ngetRedMask(address()); }
	public long getGreenMask() { return ngetGreenMask(address()); }
	public long getBlueMask() { return ngetBlueMask(address()); }
	public int getBitsPerRgb() { return ngetBitsPerRgb(address()); }
	public int getMapEntries() { return ngetMapEntries(address()); }

	public Visual setVisualid(long visualid) { nsetVisualid(address(), visualid); return this; }
	public Visual setClazz(int clazz) { nsetClazz(address(), clazz); return this; }
	public Visual setRedMask(long red_mask) { nsetRedMask(address(), red_mask); return this; }
	public Visual setGreenMask(long green_mask) { nsetGreenMask(address(), green_mask); return this; }
	public Visual setBlueMask(long blue_mask) { nsetBlueMask(address(), blue_mask); return this; }
	public Visual setBitsPerRgb(int bits_per_rgb) { nsetBitsPerRgb(address(), bits_per_rgb); return this; }
	public Visual setMapEntries(int map_entries) { nsetMapEntries(address(), map_entries); return this; }

	/** Initializes this struct with the specified values. */
	public Visual set(
		long visualid,
		int clazz,
		long red_mask,
		long green_mask,
		long blue_mask,
		int bits_per_rgb,
		int map_entries
	) {
		setVisualid(visualid);
		setClazz(clazz);
		setRedMask(red_mask);
		setGreenMask(green_mask);
		setBlueMask(blue_mask);
		setBitsPerRgb(bits_per_rgb);
		setMapEntries(map_entries);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public Visual nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public Visual set(Visual src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public Visual set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link Visual} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static Visual malloc() {
		return new Visual(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link Visual} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static Visual calloc() {
		return new Visual(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link Visual} instance allocated with {@link BufferUtils}. */
	public static Visual create() {
		return new Visual(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetVisualid(long struct) { return memGetAddress(struct + VISUALID); }
	public static long getVisualid(ByteBuffer struct) { return ngetVisualid(memAddress(struct)); }
	public static int ngetClazz(long struct) { return memGetInt(struct + CLAZZ); }
	public static int getClazz(ByteBuffer struct) { return ngetClazz(memAddress(struct)); }
	public static long ngetRedMask(long struct) { return memGetAddress(struct + RED_MASK); }
	public static long getRedMask(ByteBuffer struct) { return ngetRedMask(memAddress(struct)); }
	public static long ngetGreenMask(long struct) { return memGetAddress(struct + GREEN_MASK); }
	public static long getGreenMask(ByteBuffer struct) { return ngetGreenMask(memAddress(struct)); }
	public static long ngetBlueMask(long struct) { return memGetAddress(struct + BLUE_MASK); }
	public static long getBlueMask(ByteBuffer struct) { return ngetBlueMask(memAddress(struct)); }
	public static int ngetBitsPerRgb(long struct) { return memGetInt(struct + BITS_PER_RGB); }
	public static int getBitsPerRgb(ByteBuffer struct) { return ngetBitsPerRgb(memAddress(struct)); }
	public static int ngetMapEntries(long struct) { return memGetInt(struct + MAP_ENTRIES); }
	public static int getMapEntries(ByteBuffer struct) { return ngetMapEntries(memAddress(struct)); }

	public static void nsetVisualid(long struct, long visualid) { memPutAddress(struct + VISUALID, visualid); }
	public static void setVisualid(ByteBuffer struct, long visualid) { nsetVisualid(memAddress(struct), visualid); }
	public static void nsetClazz(long struct, int clazz) { memPutInt(struct + CLAZZ, clazz); }
	public static void setClazz(ByteBuffer struct, int clazz) { nsetClazz(memAddress(struct), clazz); }
	public static void nsetRedMask(long struct, long red_mask) { memPutAddress(struct + RED_MASK, red_mask); }
	public static void setRedMask(ByteBuffer struct, long red_mask) { nsetRedMask(memAddress(struct), red_mask); }
	public static void nsetGreenMask(long struct, long green_mask) { memPutAddress(struct + GREEN_MASK, green_mask); }
	public static void setGreenMask(ByteBuffer struct, long green_mask) { nsetGreenMask(memAddress(struct), green_mask); }
	public static void nsetBlueMask(long struct, long blue_mask) { memPutAddress(struct + BLUE_MASK, blue_mask); }
	public static void setBlueMask(ByteBuffer struct, long blue_mask) { nsetBlueMask(memAddress(struct), blue_mask); }
	public static void nsetBitsPerRgb(long struct, int bits_per_rgb) { memPutInt(struct + BITS_PER_RGB, bits_per_rgb); }
	public static void setBitsPerRgb(ByteBuffer struct, int bits_per_rgb) { nsetBitsPerRgb(memAddress(struct), bits_per_rgb); }
	public static void nsetMapEntries(long struct, int map_entries) { memPutInt(struct + MAP_ENTRIES, map_entries); }
	public static void setMapEntries(ByteBuffer struct, int map_entries) { nsetMapEntries(memAddress(struct), map_entries); }

	// -----------------------------------

	/** An array of {@link Visual} structs. */
	public static final class Buffer extends StructBuffer<Visual, Buffer> {

		/**
		 * Creates a new {@link Visual.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link Visual#SIZEOF}, and its mark will be undefined.
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
		protected Visual newInstance(long address) {
			return new Visual(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public long getVisualid() { return ngetVisualid(address()); }
		public int getClazz() { return ngetClazz(address()); }
		public long getRedMask() { return ngetRedMask(address()); }
		public long getGreenMask() { return ngetGreenMask(address()); }
		public long getBlueMask() { return ngetBlueMask(address()); }
		public int getBitsPerRgb() { return ngetBitsPerRgb(address()); }
		public int getMapEntries() { return ngetMapEntries(address()); }

		public Visual.Buffer setVisualid(long visualid) { nsetVisualid(address(), visualid); return this; }
		public Visual.Buffer setClazz(int clazz) { nsetClazz(address(), clazz); return this; }
		public Visual.Buffer setRedMask(long red_mask) { nsetRedMask(address(), red_mask); return this; }
		public Visual.Buffer setGreenMask(long green_mask) { nsetGreenMask(address(), green_mask); return this; }
		public Visual.Buffer setBlueMask(long blue_mask) { nsetBlueMask(address(), blue_mask); return this; }
		public Visual.Buffer setBitsPerRgb(int bits_per_rgb) { nsetBitsPerRgb(address(), bits_per_rgb); return this; }
		public Visual.Buffer setMapEntries(int map_entries) { nsetMapEntries(address(), map_entries); return this; }

	}

}