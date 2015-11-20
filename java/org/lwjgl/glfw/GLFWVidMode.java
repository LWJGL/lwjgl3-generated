/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes a single video mode.
 * 
 * <h3>GLFWvidmode members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>width</td><td class="nw">int</td><td>the width, in screen coordinates, of the video mode</td></tr>
 * <tr><td>height</td><td class="nw">int</td><td>the height, in screen coordinates, of the video mode</td></tr>
 * <tr><td>redBits</td><td class="nw">int</td><td>the bit depth of the red channel of the video mode</td></tr>
 * <tr><td>greenBits</td><td class="nw">int</td><td>the bit depth of the green channel of the video mode</td></tr>
 * <tr><td>blueBits</td><td class="nw">int</td><td>the bit depth of the blue channel of the video mode</td></tr>
 * <tr><td>refreshRate</td><td class="nw">int</td><td>the refresh rate, in Hz, of the video mode</td></tr>
 * </table>
 */
public class GLFWVidMode extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		REDBITS,
		GREENBITS,
		BLUEBITS,
		REFRESHRATE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		REDBITS = layout.offsetof(2);
		GREENBITS = layout.offsetof(3);
		BLUEBITS = layout.offsetof(4);
		REFRESHRATE = layout.offsetof(5);
	}

	GLFWVidMode(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWVidMode} instance at the specified memory address. */
	public GLFWVidMode(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWVidMode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWVidMode(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }
	/** Returns the value of the {@code redBits} field. */
	public int redBits() { return nredBits(address()); }
	/** Returns the value of the {@code greenBits} field. */
	public int greenBits() { return ngreenBits(address()); }
	/** Returns the value of the {@code blueBits} field. */
	public int blueBits() { return nblueBits(address()); }
	/** Returns the value of the {@code refreshRate} field. */
	public int refreshRate() { return nrefreshRate(address()); }

	// -----------------------------------

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWVidMode malloc() {
		return new GLFWVidMode(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWVidMode calloc() {
		return new GLFWVidMode(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWVidMode} instance allocated with {@link BufferUtils}. */
	public static GLFWVidMode create() {
		return new GLFWVidMode(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWVidMode.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link GLFWVidMode.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + GLFWVidMode.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + GLFWVidMode.HEIGHT); }
	/** Unsafe version of {@link #redBits}. */
	public static int nredBits(long struct) { return memGetInt(struct + GLFWVidMode.REDBITS); }
	/** Unsafe version of {@link #greenBits}. */
	public static int ngreenBits(long struct) { return memGetInt(struct + GLFWVidMode.GREENBITS); }
	/** Unsafe version of {@link #blueBits}. */
	public static int nblueBits(long struct) { return memGetInt(struct + GLFWVidMode.BLUEBITS); }
	/** Unsafe version of {@link #refreshRate}. */
	public static int nrefreshRate(long struct) { return memGetInt(struct + GLFWVidMode.REFRESHRATE); }

	// -----------------------------------

	/** An array of {@link GLFWVidMode} structs. */
	public static final class Buffer extends StructBuffer<GLFWVidMode, Buffer> {

		/**
		 * Creates a new {@link GLFWVidMode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWVidMode#SIZEOF}, and its mark will be undefined.
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
		protected GLFWVidMode newInstance(long address) {
			return new GLFWVidMode(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return nheight(address()); }
		/** Returns the value of the {@code redBits} field. */
		public int redBits() { return nredBits(address()); }
		/** Returns the value of the {@code greenBits} field. */
		public int greenBits() { return ngreenBits(address()); }
		/** Returns the value of the {@code blueBits} field. */
		public int blueBits() { return nblueBits(address()); }
		/** Returns the value of the {@code refreshRate} field. */
		public int refreshRate() { return nrefreshRate(address()); }

	}

}