USE [MSATrialDb]
GO

/****** Object:  Table [dbo].[account_detail]    Script Date: 30.05.2022 08:42:45 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[account_detail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[balance] [float] NOT NULL,
	[date] [datetime2](7) NOT NULL,
	[debt] [float] NOT NULL,
	[receipt_code] [varchar](255) NOT NULL,
	[receipt_date] [datetime2](7) NOT NULL,
	[receipt_detail] [varchar](255) NOT NULL,
	[type] [varchar](255) NOT NULL,
	[wreceive] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


