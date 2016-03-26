/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains OpenGL-specific texture information.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>union ovrGLTexture {
    {@link OVRTexture ovrTexture} Texture;
    {@link OVRGLTextureData ovrGLTextureData} OGL;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Texture</td><td>general device settings</td></tr>
 * <tr><td>OGL</td><td>OpenGL-specific settings</td></tr>
 * </table>
 */
public class OVRGLTexture extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TEXTURE,
		OGL;

	static {
		Layout layout = __union(
			__member(OVRTexture.SIZEOF, OVRTexture.ALIGNOF),
			__member(OVRGLTextureData.SIZEOF, OVRGLTextureData.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TEXTURE = layout.offsetof(0);
		OGL = layout.offsetof(1);
	}

	OVRGLTexture(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRGLTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGLTexture(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRTexture} view of the {@code Texture} field. */
	public OVRTexture Texture() { return nTexture(address()); }
	/** Returns a {@link OVRGLTextureData} view of the {@code OGL} field. */
	public OVRGLTextureData OGL() { return nOGL(address()); }

	/** Copies the specified {@link OVRTexture} to the {@code Texture} field. */
	public OVRGLTexture Texture(OVRTexture value) { nTexture(address(), value); return this; }
	/** Copies the specified {@link OVRGLTextureData} to the {@code OGL} field. */
	public OVRGLTexture OGL(OVRGLTextureData value) { nOGL(address(), value); return this; }

	/** Unsafe version of {@link #set(OVRGLTexture) set}. */
	public OVRGLTexture nset(long struct) {
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
	public OVRGLTexture set(OVRGLTexture src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRGLTexture malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRGLTexture calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link BufferUtils}. */
	public static OVRGLTexture create() {
		return new OVRGLTexture(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRGLTexture create(long address) {
		return address == NULL ? null : new OVRGLTexture(address, null);
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRGLTexture.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTexture} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRGLTexture mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRGLTexture} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRGLTexture callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRGLTexture} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRGLTexture mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRGLTexture callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Texture}. */
	public static OVRTexture nTexture(long struct) { return OVRTexture.create(struct + OVRGLTexture.TEXTURE); }
	/** Unsafe version of {@link #OGL}. */
	public static OVRGLTextureData nOGL(long struct) { return OVRGLTextureData.create(struct + OVRGLTexture.OGL); }

	/** Unsafe version of {@link #Texture(OVRTexture) Texture}. */
	public static void nTexture(long struct, OVRTexture value) { memCopy(value.address(), struct + OVRGLTexture.TEXTURE, OVRTexture.SIZEOF); }
	/** Unsafe version of {@link #OGL(OVRGLTextureData) OGL}. */
	public static void nOGL(long struct, OVRGLTextureData value) { memCopy(value.address(), struct + OVRGLTexture.OGL, OVRGLTextureData.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRGLTexture} structs. */
	public static final class Buffer extends StructBuffer<OVRGLTexture, Buffer> {

		/**
		 * Creates a new {@link OVRGLTexture.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGLTexture#SIZEOF}, and its mark will be undefined.
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
		protected OVRGLTexture newInstance(long address) {
			return new OVRGLTexture(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRTexture} view of the {@code Texture} field. */
		public OVRTexture Texture() { return OVRGLTexture.nTexture(address()); }
		/** Returns a {@link OVRGLTextureData} view of the {@code OGL} field. */
		public OVRGLTextureData OGL() { return OVRGLTexture.nOGL(address()); }

		/** Copies the specified {@link OVRTexture} to the {@code Texture} field. */
		public OVRGLTexture.Buffer Texture(OVRTexture value) { OVRGLTexture.nTexture(address(), value); return this; }
		/** Copies the specified {@link OVRGLTextureData} to the {@code OGL} field. */
		public OVRGLTexture.Buffer OGL(OVRGLTextureData value) { OVRGLTexture.nOGL(address(), value); return this; }

	}

}