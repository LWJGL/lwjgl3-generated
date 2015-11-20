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
 * Describes a set of textures that act as a rendered flip chain.
 * 
 * <p>An ovrSwapTextureSet per layer is passed to {@link OVR#ovr_SubmitFrame} via one of the ovrLayer types. The {@code TextureCount} refers to the flip chain
 * count and not an eye count. See the layer structs and functions for information about how to use ovrSwapTextureSet.</p>
 * 
 * <p>ovrSwapTextureSets must be created by either the ovr_CreateSwapTextureSetD3D11 or {@link OVRGL#ovr_CreateSwapTextureSetGL} factory function, and must
 * be destroyed by {@link OVR#ovr_DestroySwapTextureSet}.</p>
 * 
 * <h3>ovrSwapTextureSet members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Textures</td><td class="nw">ovrTexture *</td><td>points to an array of ovrTextures</td></tr>
 * <tr><td>TextureCount</td><td class="nw">int</td><td>the number of textures referenced by the Textures array</td></tr>
 * <tr><td>CurrentIndex</td><td class="nw">int</td><td>CurrentIndex specifies which of the Textures will be used by the {@link OVR#ovr_SubmitFrame} call. This is manually incremented by the application, typically
 * in a round-robin manner.
 * 
 * <p>Before selecting a {@code Texture} as a rendertarget, the application should increment {@code CurrentIndex} by 1 and wrap it back to 0 if
 * {@code CurrentIndex == TextureCount}, so that it gets a fresh rendertarget,	one that is not currently being used for display. It can then render to
 * {@code Textures[CurrentIndex]}.</p>
 * 
 * <p>After rendering, the application calls {@link OVR#ovr_SubmitFrame} using that same {@code CurrentIndex} value	to display the new rendertarget.</p>
 * 
 * <p>The application can submit multiple frames with the same {@code ovrSwapTextureSet} and {@code CurrentIndex} value if the rendertarget does not need to
 * be updated, for example when displaying an	information display whose text has not changed since the previous frame.</p>
 * 
 * <p>Multiple layers can use the same {@code ovrSwapTextureSet} at the same time - there is no need to create a unique {@code ovrSwapTextureSet} for each
 * layer. However, all the layers using a particular {@code ovrSwapTextureSet} will share the same value of {@code CurrentIndex}, so they cannot use
 * different textures within the {@code ovrSwapTextureSet}.</p>
 * 
 * <p>Once a particular {@code Textures[CurrentIndex]} has been sent to {@link OVR#ovr_SubmitFrame}, that texture should not be rendered to until a subsequent
 * {@link OVR#ovr_SubmitFrame} is made (either with a different {@code CurrentIndex} value, or with a different {@code ovrSwapTextureSet}, or disabling the
 * layer).</td></tr>
 * </table></p>
 */
public class OVRSwapTextureSet extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		TEXTURES,
		TEXTURECOUNT,
		CURRENTINDEX;

	static {
		Layout layout = __struct(
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TEXTURES = layout.offsetof(0);
		TEXTURECOUNT = layout.offsetof(1);
		CURRENTINDEX = layout.offsetof(2);
	}

	OVRSwapTextureSet(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSwapTextureSet} instance at the specified memory address. */
	public OVRSwapTextureSet(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSwapTextureSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSwapTextureSet(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRTexture} view of the struct pointed to by the {@code Textures} field. */
	public OVRTexture Textures() { return nTexturesStruct(address()); }
	/** Returns the value of the {@code TextureCount} field. */
	public int TextureCount() { return nTextureCount(address()); }
	/** Returns the value of the {@code CurrentIndex} field. */
	public int CurrentIndex() { return nCurrentIndex(address()); }

	/** Sets the address of the specified {@link OVRTexture} to the {@code Textures} field. */
	public OVRSwapTextureSet Textures(OVRTexture value) { nTextures(address(), value); return this; }
	/** Sets the specified value to the {@code TextureCount} field. */
	public OVRSwapTextureSet TextureCount(int value) { nTextureCount(address(), value); return this; }
	/** Sets the specified value to the {@code CurrentIndex} field. */
	public OVRSwapTextureSet CurrentIndex(int value) { nCurrentIndex(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRSwapTextureSet set(
		OVRTexture Textures,
		int TextureCount,
		int CurrentIndex
	) {
		Textures(Textures);
		TextureCount(TextureCount);
		CurrentIndex(CurrentIndex);

		return this;
	}

	/** Unsafe version of {@link #set(OVRSwapTextureSet) set}. */
	public OVRSwapTextureSet nset(long struct) {
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
	public OVRSwapTextureSet set(OVRSwapTextureSet src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRSwapTextureSet) set}. */
	public OVRSwapTextureSet set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSwapTextureSet malloc() {
		return new OVRSwapTextureSet(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSwapTextureSet calloc() {
		return new OVRSwapTextureSet(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link BufferUtils}. */
	public static OVRSwapTextureSet create() {
		return new OVRSwapTextureSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRSwapTextureSet.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Textures}. */
	public static OVRTexture nTexturesStruct(long struct) { return new OVRTexture(memGetAddress(struct + OVRSwapTextureSet.TEXTURES)); }
	/** Unsafe version of {@link #TextureCount}. */
	public static int nTextureCount(long struct) { return memGetInt(struct + OVRSwapTextureSet.TEXTURECOUNT); }
	/** Unsafe version of {@link #CurrentIndex}. */
	public static int nCurrentIndex(long struct) { return memGetInt(struct + OVRSwapTextureSet.CURRENTINDEX); }

	/** Unsafe version of {@link #Textures(OVRTexture) Textures}. */
	public static void nTextures(long struct, OVRTexture value) { memPutAddress(struct + OVRSwapTextureSet.TEXTURES, value.address()); }
	/** Unsafe version of {@link #TextureCount(int) TextureCount}. */
	public static void nTextureCount(long struct, int value) { memPutInt(struct + OVRSwapTextureSet.TEXTURECOUNT, value); }
	/** Unsafe version of {@link #CurrentIndex(int) CurrentIndex}. */
	public static void nCurrentIndex(long struct, int value) { memPutInt(struct + OVRSwapTextureSet.CURRENTINDEX, value); }

	// -----------------------------------

	/** An array of {@link OVRSwapTextureSet} structs. */
	public static final class Buffer extends StructBuffer<OVRSwapTextureSet, Buffer> {

		/**
		 * Creates a new {@link OVRSwapTextureSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSwapTextureSet#SIZEOF}, and its mark will be undefined.
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
		protected OVRSwapTextureSet newInstance(long address) {
			return new OVRSwapTextureSet(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRTexture} view of the struct pointed to by the {@code Textures} field. */
		public OVRTexture Textures() { return nTexturesStruct(address()); }
		/** Returns the value of the {@code TextureCount} field. */
		public int TextureCount() { return nTextureCount(address()); }
		/** Returns the value of the {@code CurrentIndex} field. */
		public int CurrentIndex() { return nCurrentIndex(address()); }

		/** Sets the address of the specified {@link OVRTexture} to the {@code Textures} field. */
		public OVRSwapTextureSet.Buffer Textures(OVRTexture value) { nTextures(address(), value); return this; }
		/** Sets the specified value to the {@code TextureCount} field. */
		public OVRSwapTextureSet.Buffer TextureCount(int value) { nTextureCount(address(), value); return this; }
		/** Sets the specified value to the {@code CurrentIndex} field. */
		public OVRSwapTextureSet.Buffer CurrentIndex(int value) { nCurrentIndex(address(), value); return this; }

	}

}