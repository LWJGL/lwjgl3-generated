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
 * Visual structure; contains information about colormapping possible.
 * 
 * <h3>Visual members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>visualid</td><td class="nw">VisualID</td><td></td></tr>
 * <tr><td>class</td><td class="nw">int</td><td></td></tr>
 * <tr><td>red_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>green_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>blue_mask</td><td class="nw">unsigned long</td><td></td></tr>
 * <tr><td>bits_per_rgb</td><td class="nw">int</td><td></td></tr>
 * <tr><td>map_entries</td><td class="nw">int</td><td></td></tr>
 * </table>
 */
public class Visual extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		VISUALID,
		CLASS,
		RED_MASK,
		GREEN_MASK,
		BLUE_MASK,
		BITS_PER_RGB,
		MAP_ENTRIES;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		VISUALID = layout.offsetof(0);
		CLASS = layout.offsetof(1);
		RED_MASK = layout.offsetof(2);
		GREEN_MASK = layout.offsetof(3);
		BLUE_MASK = layout.offsetof(4);
		BITS_PER_RGB = layout.offsetof(5);
		MAP_ENTRIES = layout.offsetof(6);
	}

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

	/** Returns the value of the {@code visualid} field. */
	public long visualid() { return nvisualid(address()); }
	/** Returns the value of the {@code class$} field. */
	public int class$() { return nclass$(address()); }
	/** Returns the value of the {@code red_mask} field. */
	public long red_mask() { return nred_mask(address()); }
	/** Returns the value of the {@code green_mask} field. */
	public long green_mask() { return ngreen_mask(address()); }
	/** Returns the value of the {@code blue_mask} field. */
	public long blue_mask() { return nblue_mask(address()); }
	/** Returns the value of the {@code bits_per_rgb} field. */
	public int bits_per_rgb() { return nbits_per_rgb(address()); }
	/** Returns the value of the {@code map_entries} field. */
	public int map_entries() { return nmap_entries(address()); }

	/** Sets the specified value to the {@code visualid} field. */
	public Visual visualid(long value) { nvisualid(address(), value); return this; }
	/** Sets the specified value to the {@code class} field. */
	public Visual class$(int value) { nclass$(address(), value); return this; }
	/** Sets the specified value to the {@code red_mask} field. */
	public Visual red_mask(long value) { nred_mask(address(), value); return this; }
	/** Sets the specified value to the {@code green_mask} field. */
	public Visual green_mask(long value) { ngreen_mask(address(), value); return this; }
	/** Sets the specified value to the {@code blue_mask} field. */
	public Visual blue_mask(long value) { nblue_mask(address(), value); return this; }
	/** Sets the specified value to the {@code bits_per_rgb} field. */
	public Visual bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }
	/** Sets the specified value to the {@code map_entries} field. */
	public Visual map_entries(int value) { nmap_entries(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public Visual set(
		long visualid,
		int class$,
		long red_mask,
		long green_mask,
		long blue_mask,
		int bits_per_rgb,
		int map_entries
	) {
		visualid(visualid);
		class$(class$);
		red_mask(red_mask);
		green_mask(green_mask);
		blue_mask(blue_mask);
		bits_per_rgb(bits_per_rgb);
		map_entries(map_entries);

		return this;
	}

	/** Unsafe version of {@link #set(Visual) set}. */
	public Visual nset(long struct) {
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
	public Visual set(Visual src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(Visual) set}. */
	public Visual set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link Visual.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #visualid}. */
	public static long nvisualid(long struct) { return memGetAddress(struct + Visual.VISUALID); }
	/** Unsafe version of {@link #class$}. */
	public static int nclass$(long struct) { return memGetInt(struct + Visual.CLASS); }
	/** Unsafe version of {@link #red_mask}. */
	public static long nred_mask(long struct) { return memGetAddress(struct + Visual.RED_MASK); }
	/** Unsafe version of {@link #green_mask}. */
	public static long ngreen_mask(long struct) { return memGetAddress(struct + Visual.GREEN_MASK); }
	/** Unsafe version of {@link #blue_mask}. */
	public static long nblue_mask(long struct) { return memGetAddress(struct + Visual.BLUE_MASK); }
	/** Unsafe version of {@link #bits_per_rgb}. */
	public static int nbits_per_rgb(long struct) { return memGetInt(struct + Visual.BITS_PER_RGB); }
	/** Unsafe version of {@link #map_entries}. */
	public static int nmap_entries(long struct) { return memGetInt(struct + Visual.MAP_ENTRIES); }

	/** Unsafe version of {@link #visualid(long) visualid}. */
	public static void nvisualid(long struct, long value) { memPutAddress(struct + Visual.VISUALID, value); }
	/** Unsafe version of {@link #class$(int) class$}. */
	public static void nclass$(long struct, int value) { memPutInt(struct + Visual.CLASS, value); }
	/** Unsafe version of {@link #red_mask(long) red_mask}. */
	public static void nred_mask(long struct, long value) { memPutAddress(struct + Visual.RED_MASK, value); }
	/** Unsafe version of {@link #green_mask(long) green_mask}. */
	public static void ngreen_mask(long struct, long value) { memPutAddress(struct + Visual.GREEN_MASK, value); }
	/** Unsafe version of {@link #blue_mask(long) blue_mask}. */
	public static void nblue_mask(long struct, long value) { memPutAddress(struct + Visual.BLUE_MASK, value); }
	/** Unsafe version of {@link #bits_per_rgb(int) bits_per_rgb}. */
	public static void nbits_per_rgb(long struct, int value) { memPutInt(struct + Visual.BITS_PER_RGB, value); }
	/** Unsafe version of {@link #map_entries(int) map_entries}. */
	public static void nmap_entries(long struct, int value) { memPutInt(struct + Visual.MAP_ENTRIES, value); }

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

		/** Returns the value of the {@code visualid} field. */
		public long visualid() { return nvisualid(address()); }
		/** Returns the value of the {@code class$} field. */
		public int class$() { return nclass$(address()); }
		/** Returns the value of the {@code red_mask} field. */
		public long red_mask() { return nred_mask(address()); }
		/** Returns the value of the {@code green_mask} field. */
		public long green_mask() { return ngreen_mask(address()); }
		/** Returns the value of the {@code blue_mask} field. */
		public long blue_mask() { return nblue_mask(address()); }
		/** Returns the value of the {@code bits_per_rgb} field. */
		public int bits_per_rgb() { return nbits_per_rgb(address()); }
		/** Returns the value of the {@code map_entries} field. */
		public int map_entries() { return nmap_entries(address()); }

		/** Sets the specified value to the {@code visualid} field. */
		public Visual.Buffer visualid(long value) { nvisualid(address(), value); return this; }
		/** Sets the specified value to the {@code class} field. */
		public Visual.Buffer class$(int value) { nclass$(address(), value); return this; }
		/** Sets the specified value to the {@code red_mask} field. */
		public Visual.Buffer red_mask(long value) { nred_mask(address(), value); return this; }
		/** Sets the specified value to the {@code green_mask} field. */
		public Visual.Buffer green_mask(long value) { ngreen_mask(address(), value); return this; }
		/** Sets the specified value to the {@code blue_mask} field. */
		public Visual.Buffer blue_mask(long value) { nblue_mask(address(), value); return this; }
		/** Sets the specified value to the {@code bits_per_rgb} field. */
		public Visual.Buffer bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }
		/** Sets the specified value to the {@code map_entries} field. */
		public Visual.Buffer map_entries(int value) { nmap_entries(address(), value); return this; }

	}

}