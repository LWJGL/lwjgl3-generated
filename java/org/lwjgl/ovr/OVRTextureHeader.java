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

/**
 * API-independent part of a texture descriptor.
 * 
 * <h3>ovrTextureHeader members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>API</td><td class="nw">ovrRenderAPIType</td><td>the graphics API in use</td></tr>
 * <tr><td>TextureSize</td><td class="nw">{@link OVRSizei ovrSizei}</td><td>the size of the texture</td></tr>
 * </table>
 */
public class OVRTextureHeader extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		API,
		TEXTURESIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(OVRSizei.SIZEOF, OVRSizei.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		API = layout.offsetof(0);
		TEXTURESIZE = layout.offsetof(1);
	}

	OVRTextureHeader(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRTextureHeader} instance at the specified memory address. */
	public OVRTextureHeader(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRTextureHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTextureHeader(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code API} field. */
	public int API() { return nAPI(address()); }
	/** Returns a {@link OVRSizei} view of the {@code TextureSize} field. */
	public OVRSizei TextureSize() { return nTextureSize(address()); }

	/** Sets the specified value to the {@code API} field. */
	public OVRTextureHeader API(int value) { nAPI(address(), value); return this; }
	/** Copies the specified {@link OVRSizei} to the {@code TextureSize} field. */
	public OVRTextureHeader TextureSize(OVRSizei value) { nTextureSize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTextureHeader set(
		int API,
		OVRSizei TextureSize
	) {
		API(API);
		TextureSize(TextureSize);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTextureHeader) set}. */
	public OVRTextureHeader nset(long struct) {
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
	public OVRTextureHeader set(OVRTextureHeader src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRTextureHeader) set}. */
	public OVRTextureHeader set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader malloc() {
		return new OVRTextureHeader(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader calloc() {
		return new OVRTextureHeader(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link BufferUtils}. */
	public static OVRTextureHeader create() {
		return new OVRTextureHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRTextureHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #API}. */
	public static int nAPI(long struct) { return memGetInt(struct + OVRTextureHeader.API); }
	/** Unsafe version of {@link #TextureSize}. */
	public static OVRSizei nTextureSize(long struct) { return new OVRSizei(struct + OVRTextureHeader.TEXTURESIZE); }

	/** Unsafe version of {@link #API(int) API}. */
	public static void nAPI(long struct, int value) { memPutInt(struct + OVRTextureHeader.API, value); }
	/** Unsafe version of {@link #TextureSize(OVRSizei) TextureSize}. */
	public static void nTextureSize(long struct, OVRSizei value) { memCopy(value.address(), struct + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRTextureHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRTextureHeader, Buffer> {

		/**
		 * Creates a new {@link OVRTextureHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTextureHeader#SIZEOF}, and its mark will be undefined.
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
		protected OVRTextureHeader newInstance(long address) {
			return new OVRTextureHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code API} field. */
		public int API() { return nAPI(address()); }
		/** Returns a {@link OVRSizei} view of the {@code TextureSize} field. */
		public OVRSizei TextureSize() { return nTextureSize(address()); }

		/** Sets the specified value to the {@code API} field. */
		public OVRTextureHeader.Buffer API(int value) { nAPI(address(), value); return this; }
		/** Copies the specified {@link OVRSizei} to the {@code TextureSize} field. */
		public OVRTextureHeader.Buffer TextureSize(OVRSizei value) { nTextureSize(address(), value); return this; }

	}

}