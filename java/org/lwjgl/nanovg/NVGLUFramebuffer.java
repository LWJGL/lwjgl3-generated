/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A framebuffer object.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct NVGLUframebuffer {
 *     GLuint fbo;
 *     GLuint rbo;
 *     GLuint texture;
 *     int image;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>fbo</td><td>the OpenGL framebuffer object handle</td></tr>
 * <tr><td>rbo</td><td>the OpenGL renderbuffer handle</td></tr>
 * <tr><td>texture</td><td>the OpenGL texture handle</td></tr>
 * <tr><td>image</td><td>the NanoVG image handle</td></tr>
 * </table>
 */
public class NVGLUFramebuffer extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FBO,
		RBO,
		TEXTURE,
		IMAGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		FBO = layout.offsetof(0);
		RBO = layout.offsetof(1);
		TEXTURE = layout.offsetof(2);
		IMAGE = layout.offsetof(3);
	}

	NVGLUFramebuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGLUFramebuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGLUFramebuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code fbo} field. */
	public int fbo() { return nfbo(address()); }
	/** Returns the value of the {@code rbo} field. */
	public int rbo() { return nrbo(address()); }
	/** Returns the value of the {@code texture} field. */
	public int texture() { return ntexture(address()); }
	/** Returns the value of the {@code image} field. */
	public int image() { return nimage(address()); }

	/** Sets the specified value to the {@code fbo} field. */
	public NVGLUFramebuffer fbo(int value) { nfbo(address(), value); return this; }
	/** Sets the specified value to the {@code rbo} field. */
	public NVGLUFramebuffer rbo(int value) { nrbo(address(), value); return this; }
	/** Sets the specified value to the {@code texture} field. */
	public NVGLUFramebuffer texture(int value) { ntexture(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public NVGLUFramebuffer image(int value) { nimage(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NVGLUFramebuffer set(
		int fbo,
		int rbo,
		int texture,
		int image
	) {
		fbo(fbo);
		rbo(rbo);
		texture(texture);
		image(image);

		return this;
	}

	/** Unsafe version of {@link #set(NVGLUFramebuffer) set}. */
	public NVGLUFramebuffer nset(long struct) {
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
	public NVGLUFramebuffer set(NVGLUFramebuffer src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static NVGLUFramebuffer malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static NVGLUFramebuffer calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance allocated with {@link BufferUtils}. */
	public static NVGLUFramebuffer create() {
		return new NVGLUFramebuffer(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGLUFramebuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGLUFramebuffer create(long address) {
		return address == NULL ? null : new NVGLUFramebuffer(address, null);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGLUFramebuffer.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGLUFramebuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #fbo}. */
	public static int nfbo(long struct) { return memGetInt(struct + NVGLUFramebuffer.FBO); }
	/** Unsafe version of {@link #rbo}. */
	public static int nrbo(long struct) { return memGetInt(struct + NVGLUFramebuffer.RBO); }
	/** Unsafe version of {@link #texture}. */
	public static int ntexture(long struct) { return memGetInt(struct + NVGLUFramebuffer.TEXTURE); }
	/** Unsafe version of {@link #image}. */
	public static int nimage(long struct) { return memGetInt(struct + NVGLUFramebuffer.IMAGE); }

	/** Unsafe version of {@link #fbo(int) fbo}. */
	public static void nfbo(long struct, int value) { memPutInt(struct + NVGLUFramebuffer.FBO, value); }
	/** Unsafe version of {@link #rbo(int) rbo}. */
	public static void nrbo(long struct, int value) { memPutInt(struct + NVGLUFramebuffer.RBO, value); }
	/** Unsafe version of {@link #texture(int) texture}. */
	public static void ntexture(long struct, int value) { memPutInt(struct + NVGLUFramebuffer.TEXTURE, value); }
	/** Unsafe version of {@link #image(int) image}. */
	public static void nimage(long struct, int value) { memPutInt(struct + NVGLUFramebuffer.IMAGE, value); }

	// -----------------------------------

	/** An array of {@link NVGLUFramebuffer} structs. */
	public static final class Buffer extends StructBuffer<NVGLUFramebuffer, Buffer> {

		/**
		 * Creates a new {@link NVGLUFramebuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGLUFramebuffer#SIZEOF}, and its mark will be undefined.
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
		protected NVGLUFramebuffer newInstance(long address) {
			return new NVGLUFramebuffer(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code fbo} field. */
		public int fbo() { return NVGLUFramebuffer.nfbo(address()); }
		/** Returns the value of the {@code rbo} field. */
		public int rbo() { return NVGLUFramebuffer.nrbo(address()); }
		/** Returns the value of the {@code texture} field. */
		public int texture() { return NVGLUFramebuffer.ntexture(address()); }
		/** Returns the value of the {@code image} field. */
		public int image() { return NVGLUFramebuffer.nimage(address()); }

		/** Sets the specified value to the {@code fbo} field. */
		public NVGLUFramebuffer.Buffer fbo(int value) { NVGLUFramebuffer.nfbo(address(), value); return this; }
		/** Sets the specified value to the {@code rbo} field. */
		public NVGLUFramebuffer.Buffer rbo(int value) { NVGLUFramebuffer.nrbo(address(), value); return this; }
		/** Sets the specified value to the {@code texture} field. */
		public NVGLUFramebuffer.Buffer texture(int value) { NVGLUFramebuffer.ntexture(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public NVGLUFramebuffer.Buffer image(int value) { NVGLUFramebuffer.nimage(address(), value); return this; }

	}

}