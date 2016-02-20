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
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct Visual {
 *     VisualID visualid;
 *     int class;
 *     unsigned long red_mask;
 *     unsigned long green_mask;
 *     unsigned long blue_mask;
 *     int bits_per_rgb;
 *     int map_entries;
 * }</code></pre>
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
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
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
		super(address, container);
	}

	/**
	 * Creates a {@link Visual} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public Visual(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	// -----------------------------------

	/** Returns a new {@link Visual} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static Visual malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link Visual} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static Visual calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link Visual} instance allocated with {@link BufferUtils}. */
	public static Visual create() {
		return new Visual(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link Visual} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static Visual create(long address) {
		return address == NULL ? null : new Visual(address, null);
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link Visual.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link Visual.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
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
		public long visualid() { return Visual.nvisualid(address()); }
		/** Returns the value of the {@code class$} field. */
		public int class$() { return Visual.nclass$(address()); }
		/** Returns the value of the {@code red_mask} field. */
		public long red_mask() { return Visual.nred_mask(address()); }
		/** Returns the value of the {@code green_mask} field. */
		public long green_mask() { return Visual.ngreen_mask(address()); }
		/** Returns the value of the {@code blue_mask} field. */
		public long blue_mask() { return Visual.nblue_mask(address()); }
		/** Returns the value of the {@code bits_per_rgb} field. */
		public int bits_per_rgb() { return Visual.nbits_per_rgb(address()); }
		/** Returns the value of the {@code map_entries} field. */
		public int map_entries() { return Visual.nmap_entries(address()); }

		/** Sets the specified value to the {@code visualid} field. */
		public Visual.Buffer visualid(long value) { Visual.nvisualid(address(), value); return this; }
		/** Sets the specified value to the {@code class} field. */
		public Visual.Buffer class$(int value) { Visual.nclass$(address(), value); return this; }
		/** Sets the specified value to the {@code red_mask} field. */
		public Visual.Buffer red_mask(long value) { Visual.nred_mask(address(), value); return this; }
		/** Sets the specified value to the {@code green_mask} field. */
		public Visual.Buffer green_mask(long value) { Visual.ngreen_mask(address(), value); return this; }
		/** Sets the specified value to the {@code blue_mask} field. */
		public Visual.Buffer blue_mask(long value) { Visual.nblue_mask(address(), value); return this; }
		/** Sets the specified value to the {@code bits_per_rgb} field. */
		public Visual.Buffer bits_per_rgb(int value) { Visual.nbits_per_rgb(address(), value); return this; }
		/** Sets the specified value to the {@code map_entries} field. */
		public Visual.Buffer map_entries(int value) { Visual.nmap_entries(address(), value); return this; }

	}

}