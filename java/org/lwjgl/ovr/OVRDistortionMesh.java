/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes a full set of distortion mesh data, filled in by {@link OVR#ovrHmd_CreateDistortionMesh}. Contents of this data structure, if not null, should be
 * freed by {@link OVR#ovrHmd_DestroyDistortionMesh}.
 */
public final class OVRDistortionMesh implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		PVERTEXDATA,
		PINDEXDATA,
		VERTEXCOUNT,
		INDEXCOUNT;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		PVERTEXDATA = offsets.get(0);
		PINDEXDATA = offsets.get(1);
		VERTEXCOUNT = offsets.get(2);
		INDEXCOUNT = offsets.get(3);
	}

	private final ByteBuffer struct;

	public OVRDistortionMesh() {
		this(malloc());
	}

	public OVRDistortionMesh(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setPVertexData(long pVertexData) { pVertexData(struct, pVertexData); }
	public void setPVertexData(ByteBuffer pVertexData) { pVertexData(struct, pVertexData); }
	public void setPIndexData(long pIndexData) { pIndexData(struct, pIndexData); }
	public void setPIndexData(ByteBuffer pIndexData) { pIndexData(struct, pIndexData); }
	public void setVertexCount(int VertexCount) { VertexCount(struct, VertexCount); }
	public void setIndexCount(int IndexCount) { IndexCount(struct, IndexCount); }

	public long getPVertexData() { return pVertexData(struct); }
	public ByteBuffer getPVertexDataBuffer() { return pVertexDataBuffer(struct); }
	public long getPIndexData() { return pIndexData(struct); }
	public ByteBuffer getPIndexData(int byteLen) { return pIndexData(struct, byteLen); }
	public int getVertexCount() { return VertexCount(struct); }
	public int getIndexCount() { return IndexCount(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer pVertexData,
		ByteBuffer pIndexData,
		int VertexCount,
		int IndexCount
	) {
		ByteBuffer ovrdistortionmesh = malloc();

		pVertexData(ovrdistortionmesh, pVertexData);
		pIndexData(ovrdistortionmesh, pIndexData);
		VertexCount(ovrdistortionmesh, VertexCount);
		IndexCount(ovrdistortionmesh, IndexCount);

		return ovrdistortionmesh;
	}

	public static void pVertexData(ByteBuffer ovrdistortionmesh, long pVertexData) { PointerBuffer.put(ovrdistortionmesh, ovrdistortionmesh.position() + PVERTEXDATA, pVertexData); }
	public static void pVertexData(ByteBuffer ovrdistortionmesh, ByteBuffer pVertexData) { pVertexData(ovrdistortionmesh, memAddressSafe(pVertexData)); }
	public static void pIndexData(ByteBuffer ovrdistortionmesh, long pIndexData) { PointerBuffer.put(ovrdistortionmesh, ovrdistortionmesh.position() + PINDEXDATA, pIndexData); }
	public static void pIndexData(ByteBuffer ovrdistortionmesh, ByteBuffer pIndexData) { pIndexData(ovrdistortionmesh, memAddressSafe(pIndexData)); }
	public static void VertexCount(ByteBuffer ovrdistortionmesh, int VertexCount) { ovrdistortionmesh.putInt(ovrdistortionmesh.position() + VERTEXCOUNT, VertexCount); }
	public static void IndexCount(ByteBuffer ovrdistortionmesh, int IndexCount) { ovrdistortionmesh.putInt(ovrdistortionmesh.position() + INDEXCOUNT, IndexCount); }

	public static long pVertexData(ByteBuffer ovrdistortionmesh) { return PointerBuffer.get(ovrdistortionmesh, ovrdistortionmesh.position() + PVERTEXDATA); }
	public static ByteBuffer pVertexDataBuffer(ByteBuffer ovrdistortionmesh) { return memByteBuffer(pVertexData(ovrdistortionmesh), OVRDistortionVertex.SIZEOF); }
	public static long pIndexData(ByteBuffer ovrdistortionmesh) { return PointerBuffer.get(ovrdistortionmesh, ovrdistortionmesh.position() + PINDEXDATA); }
	public static ByteBuffer pIndexData(ByteBuffer ovrdistortionmesh, int byteLen) { return memByteBuffer(pIndexData(ovrdistortionmesh), byteLen); }
	public static int VertexCount(ByteBuffer ovrdistortionmesh) { return ovrdistortionmesh.getInt(ovrdistortionmesh.position() + VERTEXCOUNT); }
	public static int IndexCount(ByteBuffer ovrdistortionmesh) { return ovrdistortionmesh.getInt(ovrdistortionmesh.position() + INDEXCOUNT); }

}