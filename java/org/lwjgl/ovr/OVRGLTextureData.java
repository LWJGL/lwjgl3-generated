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
 * OpenGL texture data.
 * 
 * <h3>ovrGLTextureData members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Header</td><td class="nw">{@link OVRTextureHeader ovrTextureHeader}</td><td>general device settings</td></tr>
 * <tr><td>TexId</td><td class="nw">GLuint</td><td>the OpenGL name for this texture</td></tr>
 * </table>
 */
public class OVRGLTextureData extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADER,
		TEXID;

	static {
		Layout layout = __struct(
			__member(OVRTextureHeader.SIZEOF, OVRTextureHeader.__ALIGNMENT),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADER = layout.offsetof(0);
		TEXID = layout.offsetof(1);
	}

	OVRGLTextureData(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRGLTextureData} instance at the specified memory address. */
	public OVRGLTextureData(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRGLTextureData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGLTextureData(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRTextureHeader} view of the {@code Header} field. */
	public OVRTextureHeader Header() { return nHeader(address()); }
	/** Returns the value of the {@code TexId} field. */
	public int TexId() { return nTexId(address()); }

	/** Copies the specified {@link OVRTextureHeader} to the {@code Header} field. */
	public OVRGLTextureData Header(OVRTextureHeader value) { nHeader(address(), value); return this; }
	/** Sets the specified value to the {@code TexId} field. */
	public OVRGLTextureData TexId(int value) { nTexId(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRGLTextureData set(
		OVRTextureHeader Header,
		int TexId
	) {
		Header(Header);
		TexId(TexId);

		return this;
	}

	/** Unsafe version of {@link #set(OVRGLTextureData) set}. */
	public OVRGLTextureData nset(long struct) {
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
	public OVRGLTextureData set(OVRGLTextureData src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRGLTextureData) set}. */
	public OVRGLTextureData set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRGLTextureData malloc() {
		return new OVRGLTextureData(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRGLTextureData calloc() {
		return new OVRGLTextureData(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link BufferUtils}. */
	public static OVRGLTextureData create() {
		return new OVRGLTextureData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRGLTextureData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Header}. */
	public static OVRTextureHeader nHeader(long struct) { return new OVRTextureHeader(struct + OVRGLTextureData.HEADER); }
	/** Unsafe version of {@link #TexId}. */
	public static int nTexId(long struct) { return memGetInt(struct + OVRGLTextureData.TEXID); }

	/** Unsafe version of {@link #Header(OVRTextureHeader) Header}. */
	public static void nHeader(long struct, OVRTextureHeader value) { memCopy(value.address(), struct + OVRGLTextureData.HEADER, OVRTextureHeader.SIZEOF); }
	/** Unsafe version of {@link #TexId(int) TexId}. */
	public static void nTexId(long struct, int value) { memPutInt(struct + OVRGLTextureData.TEXID, value); }

	// -----------------------------------

	/** An array of {@link OVRGLTextureData} structs. */
	public static final class Buffer extends StructBuffer<OVRGLTextureData, Buffer> {

		/**
		 * Creates a new {@link OVRGLTextureData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGLTextureData#SIZEOF}, and its mark will be undefined.
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
		protected OVRGLTextureData newInstance(long address) {
			return new OVRGLTextureData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRTextureHeader} view of the {@code Header} field. */
		public OVRTextureHeader Header() { return nHeader(address()); }
		/** Returns the value of the {@code TexId} field. */
		public int TexId() { return nTexId(address()); }

		/** Copies the specified {@link OVRTextureHeader} to the {@code Header} field. */
		public OVRGLTextureData.Buffer Header(OVRTextureHeader value) { nHeader(address(), value); return this; }
		/** Sets the specified value to the {@code TexId} field. */
		public OVRGLTextureData.Buffer TexId(int value) { nTexId(address(), value); return this; }

	}

}