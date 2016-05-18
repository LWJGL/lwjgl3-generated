/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Passed to {@link EXTDebugMarker#vkDebugMarkerSetObjectTagEXT DebugMarkerSetObjectTagEXT} to attach arbitrary data to a Vulkan object.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code objectType} &ndash; the type of the object to be tagged. One of:<br><table><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td></tr></table></li>
 * <li>{@code object} &ndash; the object to be tagged</li>
 * <li>{@code tagName} &ndash; a numerical identifier of the tag</li>
 * <li>{@code tagSize} &ndash; the number of bytes of data to attach to the object</li>
 * <li>{@code pTag} &ndash; an array of {@code tagSize} bytes containing the data to be associated with the object</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDebugMarkerObjectTagInfoEXT {
    VkStructureType sType;
    const void * pNext;
    VkDebugReportObjectTypeEXT objectType;
    uint64_t object;
    uint64_t tagName;
    size_t tagSize;
    const void * pTag;
}</code></pre>
 */
public class VkDebugMarkerObjectTagInfoEXT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		OBJECTTYPE,
		OBJECT,
		TAGNAME,
		TAGSIZE,
		PTAG;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(8),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		OBJECTTYPE = layout.offsetof(2);
		OBJECT = layout.offsetof(3);
		TAGNAME = layout.offsetof(4);
		TAGSIZE = layout.offsetof(5);
		PTAG = layout.offsetof(6);
	}

	VkDebugMarkerObjectTagInfoEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDebugMarkerObjectTagInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDebugMarkerObjectTagInfoEXT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code objectType} field. */
	public int objectType() { return nobjectType(address()); }
	/** Returns the value of the {@code object} field. */
	public long object() { return nobject(address()); }
	/** Returns the value of the {@code tagName} field. */
	public long tagName() { return ntagName(address()); }
	/** Returns the value of the {@code tagSize} field. */
	public long tagSize() { return ntagSize(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
	public ByteBuffer pTag() { return npTag(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDebugMarkerObjectTagInfoEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDebugMarkerObjectTagInfoEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code objectType} field. */
	public VkDebugMarkerObjectTagInfoEXT objectType(int value) { nobjectType(address(), value); return this; }
	/** Sets the specified value to the {@code object} field. */
	public VkDebugMarkerObjectTagInfoEXT object(long value) { nobject(address(), value); return this; }
	/** Sets the specified value to the {@code tagName} field. */
	public VkDebugMarkerObjectTagInfoEXT tagName(long value) { ntagName(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
	public VkDebugMarkerObjectTagInfoEXT pTag(ByteBuffer value) { npTag(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDebugMarkerObjectTagInfoEXT set(
		int sType,
		long pNext,
		int objectType,
		long object,
		long tagName,
		ByteBuffer pTag
	) {
		sType(sType);
		pNext(pNext);
		objectType(objectType);
		object(object);
		tagName(tagName);
		pTag(pTag);

		return this;
	}

	/** Unsafe version of {@link #set(VkDebugMarkerObjectTagInfoEXT) set}. */
	public VkDebugMarkerObjectTagInfoEXT nset(long struct) {
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
	public VkDebugMarkerObjectTagInfoEXT set(VkDebugMarkerObjectTagInfoEXT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDebugMarkerObjectTagInfoEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDebugMarkerObjectTagInfoEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link BufferUtils}. */
	public static VkDebugMarkerObjectTagInfoEXT create() {
		return new VkDebugMarkerObjectTagInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDebugMarkerObjectTagInfoEXT create(long address) {
		return address == NULL ? null : new VkDebugMarkerObjectTagInfoEXT(address, null);
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDebugMarkerObjectTagInfoEXT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDebugMarkerObjectTagInfoEXT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugMarkerObjectTagInfoEXT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugMarkerObjectTagInfoEXT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDebugMarkerObjectTagInfoEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT); }
	/** Unsafe version of {@link #objectType}. */
	public static int nobjectType(long struct) { return memGetInt(struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE); }
	/** Unsafe version of {@link #object}. */
	public static long nobject(long struct) { return memGetLong(struct + VkDebugMarkerObjectTagInfoEXT.OBJECT); }
	/** Unsafe version of {@link #tagName}. */
	public static long ntagName(long struct) { return memGetLong(struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME); }
	/** Unsafe version of {@link #tagSize}. */
	public static long ntagSize(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE); }
	/** Unsafe version of {@link #pTag() pTag}. */
	public static ByteBuffer npTag(long struct) { return memByteBuffer(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG), (int)ntagSize(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectTagInfoEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT, value); }
	/** Unsafe version of {@link #objectType(int) objectType}. */
	public static void nobjectType(long struct, int value) { memPutInt(struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE, value); }
	/** Unsafe version of {@link #object(long) object}. */
	public static void nobject(long struct, long value) { memPutLong(struct + VkDebugMarkerObjectTagInfoEXT.OBJECT, value); }
	/** Unsafe version of {@link #tagName(long) tagName}. */
	public static void ntagName(long struct, long value) { memPutLong(struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME, value); }
	/** Sets the specified value to the {@code tagSize} field of the specified {@code struct}. */
	public static void ntagSize(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE, value); }
	/** Unsafe version of {@link #pTag(ByteBuffer) pTag}. */
	public static void npTag(long struct, ByteBuffer value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG, memAddress(value)); ntagSize(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkDebugMarkerObjectTagInfoEXT} structs. */
	public static final class Buffer extends StructBuffer<VkDebugMarkerObjectTagInfoEXT, Buffer> {

		/**
		 * Creates a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDebugMarkerObjectTagInfoEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkDebugMarkerObjectTagInfoEXT newInstance(long address) {
			return new VkDebugMarkerObjectTagInfoEXT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDebugMarkerObjectTagInfoEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDebugMarkerObjectTagInfoEXT.npNext(address()); }
		/** Returns the value of the {@code objectType} field. */
		public int objectType() { return VkDebugMarkerObjectTagInfoEXT.nobjectType(address()); }
		/** Returns the value of the {@code object} field. */
		public long object() { return VkDebugMarkerObjectTagInfoEXT.nobject(address()); }
		/** Returns the value of the {@code tagName} field. */
		public long tagName() { return VkDebugMarkerObjectTagInfoEXT.ntagName(address()); }
		/** Returns the value of the {@code tagSize} field. */
		public long tagSize() { return VkDebugMarkerObjectTagInfoEXT.ntagSize(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
		public ByteBuffer pTag() { return VkDebugMarkerObjectTagInfoEXT.npTag(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer sType(int value) { VkDebugMarkerObjectTagInfoEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer pNext(long value) { VkDebugMarkerObjectTagInfoEXT.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code objectType} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer objectType(int value) { VkDebugMarkerObjectTagInfoEXT.nobjectType(address(), value); return this; }
		/** Sets the specified value to the {@code object} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer object(long value) { VkDebugMarkerObjectTagInfoEXT.nobject(address(), value); return this; }
		/** Sets the specified value to the {@code tagName} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer tagName(long value) { VkDebugMarkerObjectTagInfoEXT.ntagName(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
		public VkDebugMarkerObjectTagInfoEXT.Buffer pTag(ByteBuffer value) { VkDebugMarkerObjectTagInfoEXT.npTag(address(), value); return this; }

	}

}