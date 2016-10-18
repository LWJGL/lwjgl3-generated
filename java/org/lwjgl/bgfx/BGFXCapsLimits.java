/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Rendering limits.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxDrawCalls} &ndash; maximum draw calls</li>
 * <li>{@code maxBlits} &ndash; maximum number of blit calls</li>
 * <li>{@code maxTextureSize} &ndash; maximum texture size</li>
 * <li>{@code maxViews} &ndash; maximum views</li>
 * <li>{@code maxFrameBuffers} &ndash; maximum number of frame buffer handles</li>
 * <li>{@code maxFBAttachments} &ndash; maximum frame buffer attachments</li>
 * <li>{@code maxPrograms} &ndash; maximum number of program handles</li>
 * <li>{@code maxShaders} &ndash; maximum number of shader handles</li>
 * <li>{@code maxTextures} &ndash; maximum number of texture handles</li>
 * <li>{@code maxTextureSamplers} &ndash; maximum number of texture samplers</li>
 * <li>{@code maxVertexDecls} &ndash; maximum number of vertex format declarations</li>
 * <li>{@code maxVertexStreams} &ndash; maximum number of vertex streams</li>
 * <li>{@code maxIndexBuffers} &ndash; maximum number of index buffer handles</li>
 * <li>{@code maxVertexBuffers} &ndash; maximum number of vertex buffer handles</li>
 * <li>{@code maxDynamicIndexBuffers} &ndash; maximum number of dynamic index buffer handles</li>
 * <li>{@code maxDynamicVertexBuffers} &ndash; maximum number of vertex buffer handles</li>
 * <li>{@code maxUniforms} &ndash; maximum number of uniform handles</li>
 * <li>{@code maxOcclusionQueries} &ndash; maximum number of occlusion query handles</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_caps_limits_t {
    uint32_t maxDrawCalls;
    uint32_t maxBlits;
    uint32_t maxTextureSize;
    uint32_t maxViews;
    uint32_t maxFrameBuffers;
    uint32_t maxFBAttachments;
    uint32_t maxPrograms;
    uint32_t maxShaders;
    uint32_t maxTextures;
    uint32_t maxTextureSamplers;
    uint32_t maxVertexDecls;
    uint32_t maxVertexStreams;
    uint32_t maxIndexBuffers;
    uint32_t maxVertexBuffers;
    uint32_t maxDynamicIndexBuffers;
    uint32_t maxDynamicVertexBuffers;
    uint32_t maxUniforms;
    uint32_t maxOcclusionQueries;
}</code></pre>
 */
public class BGFXCapsLimits extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MAXDRAWCALLS,
		MAXBLITS,
		MAXTEXTURESIZE,
		MAXVIEWS,
		MAXFRAMEBUFFERS,
		MAXFBATTACHMENTS,
		MAXPROGRAMS,
		MAXSHADERS,
		MAXTEXTURES,
		MAXTEXTURESAMPLERS,
		MAXVERTEXDECLS,
		MAXVERTEXSTREAMS,
		MAXINDEXBUFFERS,
		MAXVERTEXBUFFERS,
		MAXDYNAMICINDEXBUFFERS,
		MAXDYNAMICVERTEXBUFFERS,
		MAXUNIFORMS,
		MAXOCCLUSIONQUERIES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MAXDRAWCALLS = layout.offsetof(0);
		MAXBLITS = layout.offsetof(1);
		MAXTEXTURESIZE = layout.offsetof(2);
		MAXVIEWS = layout.offsetof(3);
		MAXFRAMEBUFFERS = layout.offsetof(4);
		MAXFBATTACHMENTS = layout.offsetof(5);
		MAXPROGRAMS = layout.offsetof(6);
		MAXSHADERS = layout.offsetof(7);
		MAXTEXTURES = layout.offsetof(8);
		MAXTEXTURESAMPLERS = layout.offsetof(9);
		MAXVERTEXDECLS = layout.offsetof(10);
		MAXVERTEXSTREAMS = layout.offsetof(11);
		MAXINDEXBUFFERS = layout.offsetof(12);
		MAXVERTEXBUFFERS = layout.offsetof(13);
		MAXDYNAMICINDEXBUFFERS = layout.offsetof(14);
		MAXDYNAMICVERTEXBUFFERS = layout.offsetof(15);
		MAXUNIFORMS = layout.offsetof(16);
		MAXOCCLUSIONQUERIES = layout.offsetof(17);
	}

	BGFXCapsLimits(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXCapsLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXCapsLimits(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code maxDrawCalls} field. */
	public int maxDrawCalls() { return nmaxDrawCalls(address()); }
	/** Returns the value of the {@code maxBlits} field. */
	public int maxBlits() { return nmaxBlits(address()); }
	/** Returns the value of the {@code maxTextureSize} field. */
	public int maxTextureSize() { return nmaxTextureSize(address()); }
	/** Returns the value of the {@code maxViews} field. */
	public int maxViews() { return nmaxViews(address()); }
	/** Returns the value of the {@code maxFrameBuffers} field. */
	public int maxFrameBuffers() { return nmaxFrameBuffers(address()); }
	/** Returns the value of the {@code maxFBAttachments} field. */
	public int maxFBAttachments() { return nmaxFBAttachments(address()); }
	/** Returns the value of the {@code maxPrograms} field. */
	public int maxPrograms() { return nmaxPrograms(address()); }
	/** Returns the value of the {@code maxShaders} field. */
	public int maxShaders() { return nmaxShaders(address()); }
	/** Returns the value of the {@code maxTextures} field. */
	public int maxTextures() { return nmaxTextures(address()); }
	/** Returns the value of the {@code maxTextureSamplers} field. */
	public int maxTextureSamplers() { return nmaxTextureSamplers(address()); }
	/** Returns the value of the {@code maxVertexDecls} field. */
	public int maxVertexDecls() { return nmaxVertexDecls(address()); }
	/** Returns the value of the {@code maxVertexStreams} field. */
	public int maxVertexStreams() { return nmaxVertexStreams(address()); }
	/** Returns the value of the {@code maxIndexBuffers} field. */
	public int maxIndexBuffers() { return nmaxIndexBuffers(address()); }
	/** Returns the value of the {@code maxVertexBuffers} field. */
	public int maxVertexBuffers() { return nmaxVertexBuffers(address()); }
	/** Returns the value of the {@code maxDynamicIndexBuffers} field. */
	public int maxDynamicIndexBuffers() { return nmaxDynamicIndexBuffers(address()); }
	/** Returns the value of the {@code maxDynamicVertexBuffers} field. */
	public int maxDynamicVertexBuffers() { return nmaxDynamicVertexBuffers(address()); }
	/** Returns the value of the {@code maxUniforms} field. */
	public int maxUniforms() { return nmaxUniforms(address()); }
	/** Returns the value of the {@code maxOcclusionQueries} field. */
	public int maxOcclusionQueries() { return nmaxOcclusionQueries(address()); }

	// -----------------------------------

	/** Returns a new {@link BGFXCapsLimits} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXCapsLimits create(long address) {
		return address == NULL ? null : new BGFXCapsLimits(address, null);
	}

	/**
	 * Create a {@link BGFXCapsLimits.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #maxDrawCalls}. */
	public static int nmaxDrawCalls(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDRAWCALLS); }
	/** Unsafe version of {@link #maxBlits}. */
	public static int nmaxBlits(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXBLITS); }
	/** Unsafe version of {@link #maxTextureSize}. */
	public static int nmaxTextureSize(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURESIZE); }
	/** Unsafe version of {@link #maxViews}. */
	public static int nmaxViews(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVIEWS); }
	/** Unsafe version of {@link #maxFrameBuffers}. */
	public static int nmaxFrameBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXFRAMEBUFFERS); }
	/** Unsafe version of {@link #maxFBAttachments}. */
	public static int nmaxFBAttachments(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXFBATTACHMENTS); }
	/** Unsafe version of {@link #maxPrograms}. */
	public static int nmaxPrograms(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXPROGRAMS); }
	/** Unsafe version of {@link #maxShaders}. */
	public static int nmaxShaders(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXSHADERS); }
	/** Unsafe version of {@link #maxTextures}. */
	public static int nmaxTextures(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURES); }
	/** Unsafe version of {@link #maxTextureSamplers}. */
	public static int nmaxTextureSamplers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURESAMPLERS); }
	/** Unsafe version of {@link #maxVertexDecls}. */
	public static int nmaxVertexDecls(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXDECLS); }
	/** Unsafe version of {@link #maxVertexStreams}. */
	public static int nmaxVertexStreams(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXSTREAMS); }
	/** Unsafe version of {@link #maxIndexBuffers}. */
	public static int nmaxIndexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXINDEXBUFFERS); }
	/** Unsafe version of {@link #maxVertexBuffers}. */
	public static int nmaxVertexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXBUFFERS); }
	/** Unsafe version of {@link #maxDynamicIndexBuffers}. */
	public static int nmaxDynamicIndexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDYNAMICINDEXBUFFERS); }
	/** Unsafe version of {@link #maxDynamicVertexBuffers}. */
	public static int nmaxDynamicVertexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDYNAMICVERTEXBUFFERS); }
	/** Unsafe version of {@link #maxUniforms}. */
	public static int nmaxUniforms(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXUNIFORMS); }
	/** Unsafe version of {@link #maxOcclusionQueries}. */
	public static int nmaxOcclusionQueries(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXOCCLUSIONQUERIES); }

	// -----------------------------------

	/** An array of {@link BGFXCapsLimits} structs. */
	public static class Buffer extends StructBuffer<BGFXCapsLimits, Buffer> {

		/**
		 * Creates a new {@link BGFXCapsLimits.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXCapsLimits#SIZEOF}, and its mark will be undefined.
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
		protected BGFXCapsLimits newInstance(long address) {
			return new BGFXCapsLimits(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code maxDrawCalls} field. */
		public int maxDrawCalls() { return BGFXCapsLimits.nmaxDrawCalls(address()); }
		/** Returns the value of the {@code maxBlits} field. */
		public int maxBlits() { return BGFXCapsLimits.nmaxBlits(address()); }
		/** Returns the value of the {@code maxTextureSize} field. */
		public int maxTextureSize() { return BGFXCapsLimits.nmaxTextureSize(address()); }
		/** Returns the value of the {@code maxViews} field. */
		public int maxViews() { return BGFXCapsLimits.nmaxViews(address()); }
		/** Returns the value of the {@code maxFrameBuffers} field. */
		public int maxFrameBuffers() { return BGFXCapsLimits.nmaxFrameBuffers(address()); }
		/** Returns the value of the {@code maxFBAttachments} field. */
		public int maxFBAttachments() { return BGFXCapsLimits.nmaxFBAttachments(address()); }
		/** Returns the value of the {@code maxPrograms} field. */
		public int maxPrograms() { return BGFXCapsLimits.nmaxPrograms(address()); }
		/** Returns the value of the {@code maxShaders} field. */
		public int maxShaders() { return BGFXCapsLimits.nmaxShaders(address()); }
		/** Returns the value of the {@code maxTextures} field. */
		public int maxTextures() { return BGFXCapsLimits.nmaxTextures(address()); }
		/** Returns the value of the {@code maxTextureSamplers} field. */
		public int maxTextureSamplers() { return BGFXCapsLimits.nmaxTextureSamplers(address()); }
		/** Returns the value of the {@code maxVertexDecls} field. */
		public int maxVertexDecls() { return BGFXCapsLimits.nmaxVertexDecls(address()); }
		/** Returns the value of the {@code maxVertexStreams} field. */
		public int maxVertexStreams() { return BGFXCapsLimits.nmaxVertexStreams(address()); }
		/** Returns the value of the {@code maxIndexBuffers} field. */
		public int maxIndexBuffers() { return BGFXCapsLimits.nmaxIndexBuffers(address()); }
		/** Returns the value of the {@code maxVertexBuffers} field. */
		public int maxVertexBuffers() { return BGFXCapsLimits.nmaxVertexBuffers(address()); }
		/** Returns the value of the {@code maxDynamicIndexBuffers} field. */
		public int maxDynamicIndexBuffers() { return BGFXCapsLimits.nmaxDynamicIndexBuffers(address()); }
		/** Returns the value of the {@code maxDynamicVertexBuffers} field. */
		public int maxDynamicVertexBuffers() { return BGFXCapsLimits.nmaxDynamicVertexBuffers(address()); }
		/** Returns the value of the {@code maxUniforms} field. */
		public int maxUniforms() { return BGFXCapsLimits.nmaxUniforms(address()); }
		/** Returns the value of the {@code maxOcclusionQueries} field. */
		public int maxOcclusionQueries() { return BGFXCapsLimits.nmaxOcclusionQueries(address()); }

	}

}